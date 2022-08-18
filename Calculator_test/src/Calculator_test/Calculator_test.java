package Calculator_test;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/*
 *  이 계산기는 간단한 사칙연산 정도만 할 수 있는 계산기 입니다.
 *  
 *  결과 값 출력 후에 추가로 사칙연산 입력 시 계속 연산 가능합니다.
 *  결과 값 출력 후에 사칙연산 입력하지 않고 숫자를 눌렀을 경우에는 초기화 되도록 설정하였습니다.
 *  결과 값 출력 후에 다시 = 버튼을 누르면 아무런 반응을 하지 않습니다.
 *  여러 변수의 사칙연산 (1+3+5 같은 식) 을 제외하면 계산이 가능하도록 개선을 진행하였습니다.
 */

public class Calculator_test {

	JFrame frame;
	JPanel panel;
	JLabel result;
	String total = null;

	// 전역변수 초기화
	String a = "";
	String b = "";
	int CalCase = 0;
	boolean count;

	public void Layout() {

		frame = new JFrame();
		panel = new JPanel();

		JButton btn_num1 = new JButton("1");
		JButton btn_num2 = new JButton("2");
		JButton btn_num3 = new JButton("3");
		JButton btn_num4 = new JButton("4");
		JButton btn_num5 = new JButton("5");
		JButton btn_num6 = new JButton("6");
		JButton btn_num7 = new JButton("7");
		JButton btn_num8 = new JButton("8");
		JButton btn_num9 = new JButton("9");
		JButton btn_num0 = new JButton("0");

		JButton btn_plus = new JButton("+");
		JButton btn_minus = new JButton("-");
		JButton btn_mul = new JButton("*");
		JButton btn_div = new JButton("/");

		JButton btn_equal = new JButton("=");

		JButton btn_reset = new JButton("ac");

		result = new JLabel("0", JLabel.RIGHT);

		panel.setLayout(null);

		// panel에 요소들 추가
		panel.add(result);
		panel.add(btn_plus);
		panel.add(btn_minus);
		panel.add(btn_mul);
		panel.add(btn_div);
		panel.add(btn_num1);
		panel.add(btn_num2);
		panel.add(btn_num3);
		panel.add(btn_num4);
		panel.add(btn_num5);
		panel.add(btn_num6);
		panel.add(btn_num7);
		panel.add(btn_num8);
		panel.add(btn_num9);
		panel.add(btn_num0);
		panel.add(btn_equal);
		panel.add(btn_reset);

		// 각 요소 레이아웃에 배치
		result.setBounds(50, 50, 230, 50);
		btn_plus.setBounds(50, 110, 50, 50);
		btn_minus.setBounds(110, 110, 50, 50);
		btn_mul.setBounds(170, 110, 50, 50);
		btn_div.setBounds(230, 110, 50, 50);
		btn_num1.setBounds(50, 170, 50, 50);
		btn_num2.setBounds(110, 170, 50, 50);
		btn_num3.setBounds(170, 170, 50, 50);
		btn_num4.setBounds(50, 230, 50, 50);
		btn_num5.setBounds(110, 230, 50, 50);
		btn_num6.setBounds(170, 230, 50, 50);
		btn_num7.setBounds(50, 290, 50, 50);
		btn_num8.setBounds(110, 290, 50, 50);
		btn_num9.setBounds(170, 290, 50, 50);
		btn_num0.setBounds(50, 350, 170, 50);
		btn_equal.setBounds(230, 170, 50, 110);
		btn_reset.setBounds(230, 290, 50, 110);

		// 이벤트 발생
		btn_num1.addActionListener(new Calculate());
		btn_num2.addActionListener(new Calculate());
		btn_num3.addActionListener(new Calculate());
		btn_num4.addActionListener(new Calculate());
		btn_num5.addActionListener(new Calculate());
		btn_num6.addActionListener(new Calculate());
		btn_num7.addActionListener(new Calculate());
		btn_num8.addActionListener(new Calculate());
		btn_num9.addActionListener(new Calculate());
		btn_num0.addActionListener(new Calculate());

		btn_plus.addActionListener(new Arithmetic());
		btn_minus.addActionListener(new Arithmetic());
		btn_mul.addActionListener(new Arithmetic());
		btn_div.addActionListener(new Arithmetic());

		btn_equal.addActionListener(new Equal());
		btn_reset.addActionListener(new AllClear());

		frame.add(panel);

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(350, 500);
		frame.setVisible(true);
	}

	public static void main(String[] args) {
		Calculator_test SwingCal = new Calculator_test();
		SwingCal.Layout();

	}

	class Calculate implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			JButton btn = (JButton) e.getSource();

			// count = false : 사칙연산을 누르기 전 숫자 지정
			// count = true : 사칙연산을 누른 후 숫자 지정
			if (count == false) {
				if (btn.getText().equals("1")) {
					a += "1";
					result.setText(a);
				} else if (btn.getText().equals("2")) {
					a += "2";
					result.setText(a);
				} else if (btn.getText().equals("3")) {
					a += "3";
					result.setText(a);
				} else if (btn.getText().equals("4")) {
					a += "4";
					result.setText(a);
				} else if (btn.getText().equals("5")) {
					a += "5";
					result.setText(a);
				} else if (btn.getText().equals("6")) {
					a += "6";
					result.setText(a);
				} else if (btn.getText().equals("7")) {
					a += "7";
					result.setText(a);
				} else if (btn.getText().equals("8")) {
					a += "8";
					result.setText(a);
				} else if (btn.getText().equals("9")) {
					a += "9";
					result.setText(a);
				} else if (btn.getText().equals("0")) {
					a += "0";
					result.setText(a);
				}
			} else if (count == true) {

				// 바깥 if문 : 결과 값 출력 후에 사칙연산 입력하지 않고 숫자를 눌렀을 경우 초기화 되도록 설정
				if (CalCase != 0) {

					if (btn.getText().equals("1")) {
						b += "1";
						result.setText(b);
					} else if (btn.getText().equals("2")) {
						b += "2";
						result.setText(b);
					} else if (btn.getText().equals("3")) {
						b += "3";
						result.setText(b);
					} else if (btn.getText().equals("4")) {
						b += "4";
						result.setText(b);
					} else if (btn.getText().equals("5")) {
						b += "5";
						result.setText(b);
					} else if (btn.getText().equals("6")) {
						b += "6";
						result.setText(b);
					} else if (btn.getText().equals("7")) {
						b += "7";
						result.setText(b);
					} else if (btn.getText().equals("8")) {
						b += "8";
						result.setText(b);
					} else if (btn.getText().equals("9")) {
						b += "9";
						result.setText(b);
					} else if (btn.getText().equals("0")) {
						b += "0";
						result.setText(b);
					}

				} else {
					a = "";
					b = "";
					CalCase = 0;
					total = null;
					result.setText("0");
					count = false;
				}

			}
		}
	}

	class Arithmetic implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			JButton btn = (JButton) e.getSource();

			// 사칙연산을 누르면 count가 true로 되면서 입력이 b변수로 넘어가게됨
			count = true;
			if (btn.getText().equals("+")) {
				CalCase = 1;
				result.setText(a + " + ");
			} else if (btn.getText().equals("-")) {
				CalCase = 2;
				result.setText(a + " - ");
			} else if (btn.getText().equals("*")) {
				CalCase = 3;
				result.setText(a + " * ");
			} else if (btn.getText().equals("/")) {
				CalCase = 4;
				result.setText(a + " / ");
			}
		}
	}

	class Equal implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if (CalCase == 1) {
				total = Integer.toString(Integer.parseInt(a) + Integer.parseInt(b));
				result.setText(a + " + " + b + " = " + total);

			} else if (CalCase == 2) {
				total = Integer.toString(Integer.parseInt(a) - Integer.parseInt(b));
				result.setText(a + " - " + b + " = " + total);

			} else if (CalCase == 3) {
				total = Integer.toString(Integer.parseInt(a) * Integer.parseInt(b));
				result.setText(a + " * " + b + " = " + total);

			} else if (CalCase == 4) {
				total = Integer.toString(Integer.parseInt(a) / Integer.parseInt(b));
				result.setText(a + " / " + b + " = " + total);

			}

			// 결과 값 출력 후에 사칙연산 입력 시 계속 연산 가능하도록 설정
			a = total;
			b = "";
			CalCase = 0;

		}
	}

	class AllClear implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			a = "";
			b = "";
			CalCase = 0;
			total = null;
			result.setText("0");
			count = false;
		}
	}

}