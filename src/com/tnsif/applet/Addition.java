package com.tnsif.applet;

import java.applet.Applet;


import java.awt.Button;
import java.awt.TextField;
import java.awt.Event;

import java.awt.Label;

public class Addition extends Applet {
	Button b1,b2,b3;
	TextField t1,t2,t3;
	Label l1,l2,l3,l4;
	
	 public void init() {
		 
		 add(t1 = new TextField(5));
		 //add(l1 = new Label("+"));
		 //add(l2 = new Label("-"));
		// add(l3 = new Label("*"));
		 add(t2 = new TextField(5));
		 add(l4 = new Label("="));
		 add(t3 = new TextField(5));
		 add(b1 = new Button("Add"));
		 add(b2 = new Button("Sub"));
		 add(b3 = new Button("Mul"));
		  }
	 
	 public boolean action (Event e, Object o) {
		     int n1 = Integer.parseInt(t1.getText());
			 int n2 = Integer.parseInt(t2.getText());
			 int Add = n1 + n2;
			 int Sub = n1 - n2;
			 int Mul = n1 * n2;
			 if(e.target.equals(b1))
				 t3.setText(String.valueOf(Add));
			 if(e.target.equals(b2))
				 t3.setText(String.valueOf(Sub));
			 if(e.target.equals(b3))
				 t3.setText(String.valueOf(Mul));
			 return false;
		 }
		 
		 
	 } 

