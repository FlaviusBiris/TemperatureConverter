//Fac o aplicatie care sa converteasca temperaturile din celsius, fahrenheitm kelvin
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;


public class CelsiusFahrenheitKelvin{
	public static void main(String[] args){
		JFrame frame = new JFrame("Temperature Converter");
		JButton fahrenheit = new JButton("Convert to Fahrenheit");
		JButton kelvin = new JButton("Convert to Kelvin");
		JButton celsius = new JButton("Convert to Celsius");
		JTextArea firstTemperature = new JTextArea("Enter Temperature");
		JTextArea convertedTemperature = new JTextArea();
		JTextArea temperatureType = new JTextArea("Choose your starting temperature type");
		
		frame.setSize(1000, 1000);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		firstTemperature.setBounds(50, 300, 300, 200);
		frame.add(firstTemperature);
		
		temperatureType.setBounds(100, 100, 100, 150);
		frame.add(temperatureType);
		
		fahrenheit.setBounds(400 , 200, 200, 100);
		frame.add(fahrenheit);
		fahrenheit.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e){
				String temp = temperatureType.getText();
				if(temp.contains("elsius")){
					double temperature = Double.parseDouble(firstTemperature.getText());
					double temperatureConverted = Math.round((temperature*1.8+32)*100.00)/100.00;
					convertedTemperature.setText(Double.toString(temperatureConverted) + " Fahrenheit");
				}
				else if(temp.contains("elvin")){
					double temperature = Double.parseDouble(firstTemperature.getText());
					double temperatureConverted = Math.round(((temperature-273.15)*1.8+32)*100.00)/100.00;
					convertedTemperature.setText(Double.toString(temperatureConverted) + " Fahrenheit");
				}
				else{
					double temperature = Double.parseDouble(firstTemperature.getText());
					convertedTemperature.setText(Double.toString(temperature) + " Fahrenheit");
				}
			}
		});
		
		
		kelvin.setBounds(400, 400, 200, 100);
		frame.add(kelvin);
		kelvin.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e){
				String temp = temperatureType.getText();
				if(temp.contains("elsius")){
					double temperature = Double.parseDouble(firstTemperature.getText());
					double temperatureConverted = Math.round((temperature+273.15)*100.00)/100.00;
					convertedTemperature.setText(Double.toString(temperatureConverted) + " Kelvin");
				}
				else if(temp.contains("elvin")){
					double temperature = Double.parseDouble(firstTemperature.getText());
					convertedTemperature.setText(Double.toString(temperature) + " Kelvin");
				}
				else if(temp.contains("heit")){
					double temperature = Double.parseDouble(firstTemperature.getText());
					double temperatureConverted = Math.round(((temperature+459.67)* 5/9)*100.00)/100.00;
					convertedTemperature.setText(Double.toString(temperatureConverted) + " Kelvin");
				}
			}
		});
		
		celsius.setBounds(400, 600, 200, 100);
		frame.add(celsius);
		celsius.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e){
				String temp = temperatureType.getText();
				if(temp.contains("elsius")){
					double temperature = Double.parseDouble(firstTemperature.getText());
					convertedTemperature.setText(Double.toString(temperature) + " Celsius");
				}
				else if(temp.contains("elvin")){
					double temperature = Double.parseDouble(firstTemperature.getText());
					temperature -= 273.15;
					convertedTemperature.setText(Double.toString(temperature) + " Celsius");
				}
				else if(temp.contains("heit")){
					double temperature = Double.parseDouble(firstTemperature.getText());
					double temperatureConverted = Math.round(((temperature-32)*5/9)*100.00)/100.00;
					convertedTemperature.setText(Double.toString(temperatureConverted) + " Celsius");
				}
			}
		});
		
		
		convertedTemperature.setBounds(650, 300, 300, 200);
		frame.add(convertedTemperature);
		
		
	}
}
