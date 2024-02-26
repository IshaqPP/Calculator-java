import java.awt.Color;
import java.awt.Font;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.Timer;

public class Calculator implements ActionListener {
	JFrame jf;
	JLabel historyHeading;
	JLabel history;
	JLabel resultHeading;
	JLabel displayValue;
	JLabel warningHeading;
	JLabel warningLabel;
	JButton rootButton;
	JButton squareButton;
	JButton backspaceButton ;
	JButton clearAllButton;
	JButton sevenButton;
	JButton eightButton;
	JButton nineButton;
	JButton divideButton;
	JButton fourButton;
	JButton fiveButton;
	JButton sixButton;
	JButton multiplicationButton;
	JButton threeButton;
	JButton twoButton;
	JButton oneButton;
	JButton substractionButton;
	JButton zeroButton;
	JButton dotButton;
	JButton equalButton;
	JButton additionButton;
	
	String firstValue;
    String secondValue;
    String Operation;
    
	public Calculator() {
	    jf = new JFrame("CALCULATOR") ;
		jf.setLayout(null);
		jf.setBounds(50, 20, 367, 700);
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		historyHeading = new JLabel("History");
		historyHeading.setBounds(10, 10, 330, 20);
		historyHeading.setForeground(Color.BLACK);
		historyHeading.setHorizontalAlignment(SwingConstants.LEFT);
		jf.add(historyHeading);
		
		history=new JLabel();
		history.setBounds(10, 30, 330, 33);
		history.setBackground(Color.DARK_GRAY);
		history.setOpaque(true);
		history.setHorizontalAlignment(SwingConstants.RIGHT);
		history.setForeground(Color.white);
		jf.add(history);
		
		resultHeading = new JLabel("Result");
		resultHeading.setBounds(10, 70, 330, 20);
		resultHeading.setForeground(Color.GREEN);
		resultHeading.setHorizontalAlignment(SwingConstants.LEFT);
		jf.add(resultHeading);
		
		displayValue=new JLabel();
		displayValue.setBounds(10, 90, 330, 33);
		displayValue.setBackground(Color.gray);
		displayValue.setOpaque(true);
		displayValue.setHorizontalAlignment(SwingConstants.RIGHT);
		displayValue.setForeground(Color.white);
		jf.add(displayValue);
		
		warningHeading = new JLabel("Warning");
		warningHeading.setBounds(10, 130, 330, 20);
		warningHeading.setForeground(Color.orange);
		warningHeading.setHorizontalAlignment(SwingConstants.LEFT);
		jf.add(warningHeading);
		
		warningLabel = new JLabel();
		warningLabel.setBounds(10, 150, 330, 33);
		warningLabel.setBackground(Color.white);
		warningLabel.setOpaque(true);
		warningLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		warningLabel.setForeground(Color.red); 
		jf.add(warningLabel);

		
		rootButton = new JButton("√");
		rootButton.setBounds(10, 220, 60, 60);
		rootButton.setFont(new Font("Arial", Font.PLAIN, 30));
		rootButton.setMargin(new Insets(0, 0, 2, 2));
		rootButton.addActionListener(this);
		jf.add(rootButton);

		
		squareButton = new JButton("x²");
		squareButton.setBounds(100, 220, 60, 60);
		squareButton.setFont(new Font("Arial", Font.PLAIN, 30));
		squareButton.setMargin(new Insets(0, 0, 2, 0));
		squareButton.addActionListener(this);
		jf.add(squareButton);

		
		backspaceButton = new JButton("⌫");
        backspaceButton.setBounds(190, 220, 60, 60);
        backspaceButton.setFont(new Font("Arial Unicode MS", Font.PLAIN, 20)); 
        backspaceButton.setMargin(new Insets(0, 0, 0, 0));
        backspaceButton.addActionListener(this);
        jf.add(backspaceButton);
	
		clearAllButton=new JButton("AC");
		clearAllButton.setBounds(280, 220, 60, 60);
		clearAllButton.setFont(new Font("Arial", Font.PLAIN, 25));
		clearAllButton.setMargin(new Insets(0, 0, 0, 0));
		clearAllButton.addActionListener(this);
		jf.add(clearAllButton);
		
		sevenButton=new JButton("7");
		sevenButton.setBounds(10, 310, 60, 60);
		sevenButton.setFont(new Font("Arial", Font.PLAIN, 30));
		sevenButton.addActionListener(this);
		jf.add(sevenButton);
		
		eightButton=new JButton("8");
		eightButton.setBounds(100, 310, 60, 60);
		eightButton.setFont(new Font("Arial", Font.PLAIN, 30));
		eightButton.addActionListener(this);
		jf.add(eightButton);
		
		nineButton=new JButton("9");
		nineButton.setBounds(190, 310, 60, 60);
		nineButton.setFont(new Font("Arial", Font.PLAIN, 30));
		nineButton.addActionListener(this);
		jf.add(nineButton);
		
		divideButton=new JButton("/");
		divideButton.setBounds(280, 310, 60, 60);
		divideButton.setFont(new Font("Arial", Font.PLAIN, 30));
		divideButton.addActionListener(this);
		jf.add(divideButton);
		
		fourButton=new JButton("4");
		fourButton.setBounds(10, 400, 60, 60);
		fourButton.setFont(new Font("Arial", Font.PLAIN, 30));
		fourButton.addActionListener(this);
		jf.add(fourButton);
		
		fiveButton=new JButton("5");
		fiveButton.setBounds(100, 400, 60, 60);
		fiveButton.setFont(new Font("Arial", Font.PLAIN, 30));
		fiveButton.addActionListener(this);
		jf.add(fiveButton);
		
		sixButton=new JButton("6");
		sixButton.setBounds(190, 400, 60, 60);
		sixButton.setFont(new Font("Arial", Font.PLAIN, 30));
		sixButton.addActionListener(this);
		jf.add(sixButton);
		
		multiplicationButton=new JButton("*");
		multiplicationButton.setBounds(280, 400, 60, 60);
		multiplicationButton.setFont(new Font("Arial", Font.PLAIN, 30));
		multiplicationButton.setMargin(new Insets(12, 0, 0, 0));
		multiplicationButton.addActionListener(this);
		jf.add(multiplicationButton);
		
		threeButton=new JButton("3");
		threeButton.setBounds(190, 490, 60, 60);
		threeButton.setFont(new Font("Arial", Font.PLAIN, 30));
		threeButton.addActionListener(this);
		jf.add(threeButton);
		
		twoButton=new JButton("2");
		twoButton.setBounds(100, 490, 60, 60);
		twoButton.setFont(new Font("Arial", Font.PLAIN, 30));
		twoButton.addActionListener(this);
		jf.add(twoButton);
		
		oneButton=new JButton("1");
		oneButton.setBounds(10, 490, 60, 60);
		oneButton.setFont(new Font("Arial", Font.PLAIN, 30));
		oneButton.addActionListener(this);
		jf.add(oneButton);
		
		substractionButton=new JButton("-");
		substractionButton.setBounds(280, 490, 60, 60);
		substractionButton.setFont(new Font("Arial", Font.PLAIN, 30));
		substractionButton.addActionListener(this);
		jf.add(substractionButton);
		
		zeroButton=new JButton("0");
		zeroButton.setBounds(10, 580, 60, 60);
		zeroButton.setFont(new Font("Arial", Font.PLAIN, 30));
		zeroButton.addActionListener(this);
		jf.add(zeroButton);
		
		dotButton=new JButton(".");
		dotButton.setBounds(100, 580, 60, 60);
		dotButton.setFont(new Font("Arial", Font.PLAIN, 30));
		dotButton.setMargin(new Insets(0, 0, 12, 0));
		dotButton.addActionListener(this);
		jf.add(dotButton);
		
		equalButton=new JButton("=");
		equalButton.setBounds(190, 580, 60, 60);
		equalButton.setFont(new Font("Arial", Font.PLAIN, 30));
		equalButton.addActionListener(this);
		jf.add(equalButton);
		
		additionButton=new JButton("+");
		additionButton.setBounds(280, 580, 60, 60);
		additionButton.setFont(new Font("Arial", Font.PLAIN, 30));
		additionButton.addActionListener(this);
		jf.add(additionButton);
		
	}
	public static void main(String[] args) {
		new Calculator();
	}

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton button = (JButton) e.getSource();
        String buttonText = button.getText();

        if (Character.isDigit(buttonText.charAt(0))) {
            displayValue.setText(displayValue.getText() + buttonText);
        } else if (buttonText.equals(".")) {
            if (!displayValue.getText().contains(".")) {
                displayValue.setText(displayValue.getText() + buttonText);
            }
        } else if (buttonText.equals("⌫")) {
            String text = displayValue.getText();
            if (!text.isEmpty()) {
                displayValue.setText(text.substring(0, text.length() - 1));
            }
        } else if (buttonText.equals("AC")) {
            displayValue.setText("");
            history.setText("");
            warningLabel.setText("");
            firstValue = null;
            secondValue = null;
            Operation = null;
        } else if (buttonText.equals("√")) {
        	String temp = history.getText();
        	if (!temp.isEmpty() && !temp.contains("=")) {
                secondValue = displayValue.getText();
                if(secondValue.isEmpty()) {
                    warningLabel.setText("Please enter a number to calculate the square root.");
                }else {
                	double num1 = Double.parseDouble(firstValue);
                    double num2 = Double.parseDouble(secondValue);
                    num2 = Math.sqrt(num2);
                    double result = calculateResult(num1, num2, Operation);

                    displayValue.setText(Double.toString(result));
                    history.setText(firstValue + " " + Operation + " "+"√" + secondValue + " = " + result);
                    firstValue = null;
                    secondValue = null;
                    Operation = null;
               }
        	}else {
        		firstValue = displayValue.getText();
                if (!firstValue.isEmpty()) {
                    double num = Double.parseDouble(firstValue);
                    double result = Math.sqrt(num);
                    displayValue.setText(Double.toString(result));
                    history.setText("√" + firstValue + " = " + result);
                    firstValue = null;
                } else {
                    warningLabel.setText("Please enter a number to calculate the square root.");
                }
        	}
            
        } else if (buttonText.equals("x²")) {
        	String temp = history.getText();
        	if (!temp.isEmpty() && !temp.contains("=")) {
                secondValue = displayValue.getText();
                if(secondValue.isEmpty()) {
                    warningLabel.setText("Please enter a number to calculate the square.");
                }else {
                	double num1 = Double.parseDouble(firstValue);
                    double num2 = Double.parseDouble(secondValue);
                    num2 = num2 * num2;
                    double result = calculateResult(num1, num2, Operation);

                    displayValue.setText(Double.toString(result));
                    history.setText(firstValue + " " + Operation + " " + secondValue + "²"+ " = " + result);
                    firstValue = null;
                    secondValue = null;
                    Operation = null;
               }
        	}else {
        	
	            firstValue = displayValue.getText();
	            if (!firstValue.isEmpty()) {
	                double num = Double.parseDouble(firstValue);
	                double result = num * num;
	                displayValue.setText(Double.toString(result));
	                history.setText(firstValue + "² = " + result);
	                firstValue = null;
	            } else {
	                warningLabel.setText("Please enter a number to calculate the square.");
	            }
	            
	        }
        } else if (buttonText.equals("=")) {
            secondValue = displayValue.getText();
            if (firstValue != "" && secondValue != "" && Operation != null) {
                double num1 = Double.parseDouble(firstValue);
                double num2 = Double.parseDouble(secondValue);
                double result = calculateResult(num1, num2, Operation);

                displayValue.setText(Double.toString(result));
                history.setText(firstValue + " " + Operation + " " + secondValue + " = " + result);
                firstValue = null;
                secondValue = null;
                Operation = null;
            } else {
                warningLabel.setText("Please enter a valid expression");
            }
        } else {
            if (firstValue == null || firstValue == "" || firstValue.equals(".") ) {
                firstValue = displayValue.getText();
                if(firstValue.length()==0 || firstValue.equals(".") ) {
                    warningLabel.setText("Please enter a valid number before an operation");
                } else {
                    Operation = buttonText;
                    history.setText(firstValue + " " + Operation);
                    displayValue.setText("");
                }
            } else {
                warningLabel.setText("Please complete the operation");
            }
        }
        
        if (!warningLabel.getText().isEmpty()) {
	        Timer timer = new Timer(3000, new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent e) {
	                warningLabel.setText("");
	            }
	        });
	        timer.setRepeats(false); 
	        timer.start();
	    }
    }
    
    public double calculateResult(double num1, double num2, String operation) {
        double result = 0;

        switch (operation) {
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
                if (num2 == 0) {
                    warningLabel.setText("Cannot divide by zero");
                    return 0; 
                }
                result = num1 / num2;
                break;
        }

        return result;
    }

}
