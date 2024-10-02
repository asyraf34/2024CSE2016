package lecture03.temperature;

import javax.swing.*;
public class View {
    double getTemperature() {
        String input = JOptionPane.showInputDialog(null,"Input temperature in celcius: ");
        int c = Integer.parseInt(input);
        return c;
    }

    void showTemperature(double c, double f) {
        System.out.println("섭씨 " + c + "도를 화씨로 바꾸면 " + f + "도입니다.");
    }
}
