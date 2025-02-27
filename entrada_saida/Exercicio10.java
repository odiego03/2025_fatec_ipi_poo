import javax.swing.JOptionPane;
public class Exercicio10{
    static public void main(String [] args){
        double fabrica, distribuidor, impostos, custoFinal;
        fabrica = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do carro: "));
        distribuidor = 0.28 * fabrica;
        impostos = 0.45 * fabrica;
        custoFinal = fabrica + distribuidor + impostos;
        JOptionPane.showMessageDialog(null, custoFinal); 
    }
}