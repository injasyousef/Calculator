package application;
	
import java.util.ArrayList;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;


public class Main extends Application {
	@Override
	public void start(Stage stage) {
		
		Label l0=new Label("Expretion:");
		l0.setFont(new Font(15));
		Label l1=new Label("Postfix:");
		l1.setFont(new Font(15));
		Label l2=new Label("Result:");
		l2.setFont(new Font(15));
		
		TextArea t0=new TextArea();
		t0.setPrefSize(200, 50);
		TextArea t1=new TextArea();
		t1.setPrefSize(200, 40);
		TextArea t2=new TextArea();
		t2.setPrefSize(200, 20);
		
		GridPane gp0=new GridPane();
		gp0.add(l0, 0, 0);
		gp0.add(t0, 1, 0);
		gp0.add(l1, 0, 1);
		gp0.add(t1, 1, 1);
		gp0.add(l2, 0, 2);
		gp0.add(t2, 1, 2);
		gp0.setVgap(5);
		gp0.setHgap(20);
		gp0.setAlignment(Pos.CENTER);
		
		Button sin=new Button("sin");
		sin.setPrefSize(35, 35);
		sin.setStyle("-fx-background-color: lightblue;\r\n"+ "        -fx-background-radius:10;\r\n"+"-fx-effect: dropshadow( one-pass-box , rgba(0,0,0,0.8) , 0, 0.0 , 0 , 1);");
		sin.setOnAction(e->{
			t0.appendText("sin ");
		});
		
		Button sqr=new Button("√x");
		sqr.setPrefSize(35, 35);
		sqr.setStyle("-fx-background-color: lightblue;\r\n"+ "        -fx-background-radius:10;\r\n"+"-fx-effect: dropshadow( one-pass-box , rgba(0,0,0,0.8) , 0, 0.0 , 0 , 1);");
		sqr.setOnAction(e->{
			t0.appendText("√ ");
		});
		
		Button cos=new Button("cos");
		cos.setPrefSize(35, 35);
		cos.setStyle("-fx-background-color: lightblue;\r\n"+ "        -fx-background-radius:10;\r\n"+"-fx-effect: dropshadow( one-pass-box , rgba(0,0,0,0.8) , 0, 0.0 , 0 , 1);");
		cos.setOnAction(e->{
			t0.appendText("cos ");
		});
		
		Button tan=new Button("tan");
		tan.setPrefSize(35, 35);
		tan.setStyle("-fx-background-color: lightblue;\r\n"+ "        -fx-background-radius:10;\r\n"+"-fx-effect: dropshadow( one-pass-box , rgba(0,0,0,0.8) , 0, 0.0 , 0 , 1);");
		tan.setOnAction(e->{
			t0.appendText("tan ");
		});
		
		Button log=new Button("LOG");
		log.setPrefSize(35, 35);
		log.setStyle("-fx-background-color: lightblue;\r\n"+ "        -fx-background-radius:10;\r\n"+"-fx-effect: dropshadow( one-pass-box , rgba(0,0,0,0.8) , 0, 0.0 , 0 , 1);");
		log.setFont(new Font(10));
		log.setOnAction(e->{
			t0.appendText("LOG ");
		});
		
		Button ln=new Button("LN");
		ln.setPrefSize(35, 35);
		ln.setStyle("-fx-background-color: lightblue;\r\n"+ "        -fx-background-radius:10;\r\n"+"-fx-effect: dropshadow( one-pass-box , rgba(0,0,0,0.8) , 0, 0.0 , 0 , 1);");
		ln.setOnAction(e->{
			t0.appendText("ln ");
		});
		
		Button pi=new Button("∏");
		pi.setPrefSize(35, 35);
		pi.setStyle("-fx-background-color: lightblue;\r\n"+ "        -fx-background-radius:10;\r\n"+"-fx-effect: dropshadow( one-pass-box , rgba(0,0,0,0.8) , 0, 0.0 , 0 , 1);");
		pi.setOnAction(e->{
			t0.appendText("3.14");
		});
		
		Button square=new Button("x^2");
		square.setPrefSize(35, 35);
		square.setFont(new Font(10));
		square.setStyle("-fx-background-color: lightblue;\r\n"+ "        -fx-background-radius:10;\r\n"+"-fx-effect: dropshadow( one-pass-box , rgba(0,0,0,0.8) , 0, 0.0 , 0 , 1);");
		square.setOnAction(e->{
			t0.appendText(" ^ 2");
		});
		
		Button squarey=new Button("Y^x");
		squarey.setPrefSize(35, 35);
		squarey.setFont(new Font(10));
		squarey.setStyle("-fx-background-color: lightblue;\r\n"+ "        -fx-background-radius:10;\r\n"+"-fx-effect: dropshadow( one-pass-box , rgba(0,0,0,0.8) , 0, 0.0 , 0 , 1);");
		squarey.setOnAction(e->{
			t0.appendText(" ^ ");
		});
		
		Button expo=new Button("e^x");
		expo.setPrefSize(35, 35);
		expo.setFont(new Font(10));
		expo.setStyle("-fx-background-color: lightblue;\r\n"+ "        -fx-background-radius:10;\r\n"+"-fx-effect: dropshadow( one-pass-box , rgba(0,0,0,0.8) , 0, 0.0 , 0 , 1);");
		expo.setOnAction(e->{
			t0.appendText("2.718 ^ ");
		});
		
		Button divx=new Button("1/x");
		divx.setPrefSize(35, 35);
		divx.setStyle("-fx-background-color: lightblue;\r\n"+ "        -fx-background-radius:10;\r\n"+"-fx-effect: dropshadow( one-pass-box , rgba(0,0,0,0.8) , 0, 0.0 , 0 , 1);");
		divx.setOnAction(e->{
			t0.appendText("1 / ");
		});
		
		Button zero=new Button("0");
		zero.setPrefSize(35, 35);
		zero.setStyle("-fx-background-color: grey;\r\n"+ "        -fx-background-radius:10;\r\n"+"-fx-effect: dropshadow( one-pass-box , rgba(0,0,0,0.8) , 0, 0.0 , 0 , 1);");
		zero.setOnAction(e->{
			t0.appendText(zero.getText());
		});
		
		Button one=new Button("1");
		one.setPrefSize(35, 35);
		one.setStyle("-fx-background-color: grey;\r\n"+ "        -fx-background-radius:10;\r\n"+"-fx-effect: dropshadow( one-pass-box , rgba(0,0,0,0.8) , 0, 0.0 , 0 , 1);");
		one.setOnAction(e->{
			t0.appendText(one.getText());
		});
		
		Button tow=new Button("2");
		tow.setPrefSize(35, 35);
		tow.setStyle("-fx-background-color: grey;\r\n"+ "        -fx-background-radius:10;\r\n"+"-fx-effect: dropshadow( one-pass-box , rgba(0,0,0,0.8) , 0, 0.0 , 0 , 1);");
		tow.setOnAction(e->{
			t0.appendText(tow.getText());
		});
		
		Button three=new Button("3");
		three.setPrefSize(35, 35);
		three.setStyle("-fx-background-color: grey;\r\n"+ "        -fx-background-radius:10;\r\n"+"-fx-effect: dropshadow( one-pass-box , rgba(0,0,0,0.8) , 0, 0.0 , 0 , 1);");
		three.setOnAction(e->{
			t0.appendText(three.getText());
		});
		
		Button four=new Button("4");
		four.setPrefSize(35, 35);
		four.setStyle("-fx-background-color: grey;\r\n"+ "        -fx-background-radius:10;\r\n"+"-fx-effect: dropshadow( one-pass-box , rgba(0,0,0,0.8) , 0, 0.0 , 0 , 1);");
		four.setOnAction(e->{
			t0.appendText(four.getText());
		});
		
		Button five=new Button("5");
		five.setPrefSize(35, 35);
		five.setStyle("-fx-background-color: grey;\r\n"+ "        -fx-background-radius:10;\r\n"+"-fx-effect: dropshadow( one-pass-box , rgba(0,0,0,0.8) , 0, 0.0 , 0 , 1);");
		five.setOnAction(e->{
			t0.appendText(five.getText());
		});
		
		Button six=new Button("6");
		six.setPrefSize(35, 35);
		six.setStyle("-fx-background-color: grey;\r\n"+ "        -fx-background-radius:10;\r\n"+"-fx-effect: dropshadow( one-pass-box , rgba(0,0,0,0.8) , 0, 0.0 , 0 , 1);");
		six.setOnAction(e->{
			t0.appendText(six.getText());
		});
		
		Button seven=new Button("7");
		seven.setPrefSize(35, 35);
		seven.setStyle("-fx-background-color: grey;\r\n"+ "        -fx-background-radius:10;\r\n"+"-fx-effect: dropshadow( one-pass-box , rgba(0,0,0,0.8) , 0, 0.0 , 0 , 1);");
		seven.setOnAction(e->{
			t0.appendText(seven.getText());
		});
		
		Button eight=new Button("8");
		eight.setPrefSize(35, 35);
		eight.setStyle("-fx-background-color: grey;\r\n"+ "        -fx-background-radius:10;\r\n"+"-fx-effect: dropshadow( one-pass-box , rgba(0,0,0,0.8) , 0, 0.0 , 0 , 1);");
		eight.setOnAction(e->{
			t0.appendText(eight.getText());
		});
		
		Button nine=new Button("9");
		nine.setPrefSize(35, 35);
		nine.setStyle("-fx-background-color: grey;\r\n"+ "        -fx-background-radius:10;\r\n"+"-fx-effect: dropshadow( one-pass-box , rgba(0,0,0,0.8) , 0, 0.0 , 0 , 1);");
		nine.setOnAction(e->{
			t0.appendText(nine.getText());
		});
		
		Button point=new Button(".");
		point.setPrefSize(35, 35);
		point.setStyle("-fx-background-color: white;\r\n"+ "        -fx-background-radius:10;\r\n"+"-fx-effect: dropshadow( one-pass-box , rgba(0,0,0,0.8) , 0, 0.0 , 0 , 1);");
		point.setOnAction(e->{
			t0.appendText(point.getText());
		});
		
		Button open=new Button("( ");
		open.setPrefSize(35, 35);
		open.setStyle("-fx-background-color: white;\r\n"+ "        -fx-background-radius:10;\r\n"+"-fx-effect: dropshadow( one-pass-box , rgba(0,0,0,0.8) , 0, 0.0 , 0 , 1);");
		open.setOnAction(e->{
			t0.appendText(open.getText());
		});
		
		Button close=new Button(" )");
		close.setPrefSize(35, 35);
		close.setStyle("-fx-background-color: white;\r\n"+ "        -fx-background-radius:10;\r\n"+"-fx-effect: dropshadow( one-pass-box , rgba(0,0,0,0.8) , 0, 0.0 , 0 , 1);");
		close.setOnAction(e->{
			t0.appendText(close.getText());
		});
		
		Button div=new Button("/");
		div.setPrefSize(35, 35);
		div.setStyle("-fx-background-color: darkgrey;\r\n"+ "        -fx-background-radius:10;\r\n"+"-fx-effect: dropshadow( one-pass-box , rgba(0,0,0,0.8) , 0, 0.0 , 0 , 1);");
		div.setOnAction(e->{
			t0.appendText(" / ");
		});
		
		Button mult=new Button("*");
		mult.setPrefSize(35, 35);
		mult.setStyle("-fx-background-color: darkgrey;\r\n"+ "        -fx-background-radius:10;\r\n"+"-fx-effect: dropshadow( one-pass-box , rgba(0,0,0,0.8) , 0, 0.0 , 0 , 1);");
		mult.setOnAction(e->{
			t0.appendText(" * ");
		});
		
		Button sub=new Button("-");
		sub.setPrefSize(35, 35);
		sub.setStyle("-fx-background-color: darkgrey;\r\n"+ "        -fx-background-radius:10;\r\n"+"-fx-effect: dropshadow( one-pass-box , rgba(0,0,0,0.8) , 0, 0.0 , 0 , 1);");
		sub.setOnAction(e->{
			t0.appendText(" - ");
		});
		
		Button add=new Button("+");
		add.setPrefSize(35, 35);
		add.setStyle("-fx-background-color: darkgrey;\r\n"+ "        -fx-background-radius:10;\r\n"+"-fx-effect: dropshadow( one-pass-box , rgba(0,0,0,0.8) , 0, 0.0 , 0 , 1);");
		add.setOnAction(e->{
			t0.appendText(" + ");
		});
		
		Button mod=new Button("%");
		mod.setPrefSize(35, 35);
		mod.setStyle("-fx-background-color: darkgrey;\r\n"+ "        -fx-background-radius:10;\r\n"+"-fx-effect: dropshadow( one-pass-box , rgba(0,0,0,0.8) , 0, 0.0 , 0 , 1);");
		mod.setOnAction(e->{
			t0.appendText(" % ");
		});
		
		Button off=new Button("off");
		off.setPrefSize(35, 35);
		off.setStyle("-fx-background-color: blue;\r\n"+ "        -fx-background-radius:10;\r\n"+"-fx-effect: dropshadow( one-pass-box , rgba(0,0,0,0.8) , 0, 0.0 , 0 , 1);");
		off.setOnAction(e->{
			stage.close();
		});
		
		Button minus=new Button("(-)");
		minus.setPrefSize(35, 35);
		minus.setStyle("-fx-background-color: white;\r\n"+ "        -fx-background-radius:10;\r\n"+"-fx-effect: dropshadow( one-pass-box , rgba(0,0,0,0.8) , 0, 0.0 , 0 , 1);");
		minus.setOnAction(e->{
			t0.appendText("-");
		});
		
		Button ca=new Button("CA");
		ca.setPrefSize(35, 35);
		ca.setStyle("-fx-background-color: pink;\r\n"+ "        -fx-background-radius:10;\r\n"+"-fx-effect: dropshadow( one-pass-box , rgba(0,0,0,0.8) , 0, 0.0 , 0 , 1);");
		ca.setOnAction(e->{
			t0.clear();
			t1.clear();
			t2.clear();
		});
		
		Button c=new Button("C");
		c.setPrefSize(35, 35);
		c.setStyle("-fx-background-color: pink;\r\n"+ "        -fx-background-radius:10;\r\n"+"-fx-effect: dropshadow( one-pass-box , rgba(0,0,0,0.8) , 0, 0.0 , 0 , 1);");
		c.setOnAction(e->{
			String s=t0.getText();
			String[] tkz=s.split(" ");
			String temp="";
			for(int i=0;i<tkz.length-1;i++)
				temp=temp+tkz[i]+" ";
			t0.setText(temp);
		});
		
		Button back=new Button("←");
		back.setFont(new Font(15));
		back.setPrefSize(35, 35);
		back.setStyle("-fx-background-color: pink;\r\n"+ "        -fx-background-radius:10;\r\n"+"-fx-effect: dropshadow( one-pass-box , rgba(0,0,0,0.8) , 0, 0.0 , 0 , 1);");
		back.setOnAction(e->{
			String s=t0.getText();
			char[] ch=s.toCharArray();
			String temp="";
			for(int i=0;i<ch.length-1;i++)
				temp+=ch[i];
			t0.setText(temp);
		});
		
		Button fac=new Button("!");
		fac.setPrefSize(35, 35);
		fac.setStyle("-fx-background-color: lightblue;\r\n"+ "        -fx-background-radius:10;\r\n"+"-fx-effect: dropshadow( one-pass-box , rgba(0,0,0,0.8) , 0, 0.0 , 0 , 1);");
		fac.setOnAction(e->{
			t0.appendText(" !");
		});
		
		Button eq=new Button("=");
		eq.setPrefSize(290,40);
		eq.setAlignment(Pos.CENTER);
		eq.setStyle("-fx-background-color: blue;\r\n"+ "        -fx-background-radius:10;\r\n"+"-fx-effect: dropshadow( one-pass-box , rgba(0,0,0,0.8) , 0, 0.0 , 0 , 1);");
		eq.setOnAction(e->{
			String s=toPost(t0.getText());
			t1.setText(s);
			double result=evaluate(s);
			if(result==-1)
				t2.setText("ERROR!");
			else
			t2.setText(String.valueOf(result));
		});
		
		GridPane gp1=new GridPane();
		gp1.addRow(0, sin,cos,tan,open,close,fac,off);
		gp1.addRow(1,pi,squarey,seven,eight,nine,div,minus);
		gp1.addRow(2,square,sqr,four,five,six,mult,ca);
		gp1.addRow(3,expo,ln,one,tow,three,sub,c);
		gp1.addRow(4,log,divx,zero,point,mod,add,back);
		gp1.setVgap(5);
		gp1.setHgap(5);
		gp1.setAlignment(Pos.CENTER);
		
		
		VBox vb=new VBox();
		vb.getChildren().addAll(gp0,gp1,eq);
		vb.setSpacing(10);
		vb.setAlignment(Pos.CENTER);
		Scene scene=new Scene(vb,295,400);
		stage.setScene(scene);
		stage.setTitle("Calc");
		stage.show();
		
		
		
	}
	
	public String toPost(String s) {
		CursorStack<String> stack=new CursorStack<>(200);
		String ch[]=s.split(" ");
		String postfix="";
		for(String c: ch) {
			if(!c.equals("+") && !c.equals("-") && !c.equals("*") && !c.equals("/") && !c.equals("(") && !c.equals(")") && !c.equals("^") && !c.equals("LOG") && !c.equals("ln") && !c.equals("sin") && !c.equals("cos") && !c.equals("tan") && !c.equals("!") && !c.equals("√") && !c.equals("%")) {
				postfix=postfix+c+" ";
			} else if(c.equals("(")) {
				stack.push(c);
			} else if(c.equals(")")) {
				while(!stack.isEmpty()) {
					String t=stack.pop();
					if(!t.equals("(")) {
						postfix=postfix+t+" ";
					} else {
						break;
					}
				}
			} else if(c.equals("+") || c.equals("-") || c.equals("*") || c.equals("/") || c.equals("^") || c.equals("LOG") || c.equals("ln") || c.equals("sin") || c.equals("cos") || c.equals("tan") || c.equals("!") || c.equals("√") || c.equals("%")) {
				if(stack.isEmpty()) {
					stack.push(c);
				} else {
					while(!stack.isEmpty()) {
						String t=stack.pop();
						if(t.equals("(")) {
							stack.push(t);
							break;
						} else if(c.equals("+") || c.equals("-") || c.equals("*") || c.equals("/") || c.equals("^") || c.equals("LOG") || c.equals("ln") || c.equals("sin") || c.equals("cos") || c.equals("tan") || c.equals("!") || c.equals("√") || c.equals("%")) {
							if(getPrio(t)<getPrio(c)) {
								stack.push(t);
								break;
							} else {
								postfix=postfix+t+" ";
							}
						}
					}
					stack.push(c);
				}
			}
			
		}
		
		while(!stack.isEmpty())
			postfix=postfix+stack.pop()+" ";
		
		return postfix;
	}
	
	public double evaluate(String s) {
		
		String[] tkz=s.trim().split(" ");
		CursorStack<String> stack=new CursorStack<>(100);	
		int count1=0,count2=0;
		
		for(int i=0;i<tkz.length;i++) {
			if(tkz[i].equals("("))
				count1++;
			if(tkz[i].equals(")"))
				count2++;
		}
		
		if(count1!=count2)
			return -1;
		
		for(String c: tkz) {
			if (c.equals("+")) {
				double num2=Double.parseDouble(stack.pop());
				double num1=Double.parseDouble(stack.pop());
				double res=num1+num2;
				stack.push(String.valueOf(res));
			} else if(c.equals("-")) {
				double num2=Double.parseDouble(stack.pop());
				double num1=Double.parseDouble(stack.pop());
				double res=num1-num2;
				stack.push(String.valueOf(res));
			} else if(c.equals("*")) {
				double num2=Double.parseDouble(stack.pop());
				double num1=Double.parseDouble(stack.pop());
				double res=num1*num2;
				stack.push(String.valueOf(res));
			} else if(c.equals("/")) {
				double num2=Double.parseDouble(stack.pop());
				double num1=Double.parseDouble(stack.pop());
				if(num2==0)
					return -1;
				double res=num1/num2;
				stack.push(String.valueOf(res));
			} else if(c.equals("%")) {
				double num2=Double.parseDouble(stack.pop());
				double num1=Double.parseDouble(stack.pop());
				double res=num1%num2;
				stack.push(String.valueOf(res));
			} else if(c.equals("!")) {
				double num=Double.parseDouble(stack.pop());
				double res=1;
				for(int i=1;i<=num;i++){    
				      res=res*i;    
				  }
				stack.push(String.valueOf(res));
			} else if(c.equals("tan")) {
				double num=Double.parseDouble(stack.pop());
				double res=Math.tan(num);
				stack.push(String.valueOf(res));
			} else if(c.equals("cos")) {
				double num=Double.parseDouble(stack.pop());
				double res=Math.cos(num);
				stack.push(String.valueOf(res));
			} else if(c.equals("sin")) {
				double num=Double.parseDouble(stack.pop());
				double res=Math.sin(num);
				stack.push(String.valueOf(res));
			} else if(c.equals("^")){
				double num2=Double.parseDouble(stack.pop());
				double num1=Double.parseDouble(stack.pop());
				double res=Math.pow(num1, num2);
				stack.push(String.valueOf(res));
			} else if(c.equals("√")) {
				double num=Double.parseDouble(stack.pop());
				double res=Math.sqrt(num);
				stack.push(String.valueOf(res));
			} else if(c.equals("ln")) {
				double num=Double.parseDouble(stack.pop());
				double res=Math.log(num);
				stack.push(String.valueOf(res));
			} else if(c.equals("LOG")) {
				double num=Double.parseDouble(stack.pop());
				double res=Math.log10(num);
				stack.push(String.valueOf(res));
			} else {
				stack.push(c);
			}
		}
		
		double result = Double.parseDouble(stack.pop());
		if(!stack.isEmpty())
			return -1;
		return result;
	}
	
	public int getPrio(String c) {
		if(c.equals("+") || c.equals("-"))
			return 1;
		else if(c.equals("^") || c.equals("sin") || c.equals("cos") || c.equals("tan") || c.equals("ln") || c.equals("LOG") || c.equals("!") || c.equals("√"))
			return 3;
		return 2;
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
