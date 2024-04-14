package lotofacil;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Random;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JOptionPane;
import java.awt.Color;
import java.awt.Font;

public class MenuAposta0a100 extends JFrame {
    private JTextField textFieldNumero;
    private int numeroApostado;

    public MenuAposta0a100() {
        initialize();
    }

    private void initialize() {
        setTitle("Apostar de 0 à 100");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setLayout(null); // Usando layout absoluto
        
        JLabel lblInstrucao = new JLabel("Digite um número de 0 a 100:");
        lblInstrucao.setBounds(130, 56, 200, 30); // Ajustando o tamanho e a posição
        getContentPane().add(lblInstrucao);

        // Criando os componentes da interface
        textFieldNumero = new JTextField();
        textFieldNumero.setBounds(125, 100, 150, 30); // Ajustando o tamanho e a posição
        textFieldNumero.setBackground(Color.WHITE); // Cor de fundo
        textFieldNumero.setBorder(javax.swing.BorderFactory.createLineBorder(Color.BLACK)); // Borda preta
        textFieldNumero.setFont(new Font("Arial", Font.PLAIN, 14)); // Tamanho e estilo da fonte
        getContentPane().add(textFieldNumero);

        JButton btnApostar = new JButton("Apostar");
        btnApostar.setBounds(113, 153, 87, 30); // Ajustando o tamanho e a posição
        getContentPane().add(btnApostar);
        
        JButton btnVoltar = new JButton("Voltar");
        btnVoltar.setBounds(210, 153, 87, 30);
        this.getContentPane().add(btnVoltar);
        btnVoltar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose(); // Fecha a janela atual
                LotofacilInt menuPrincipal = new LotofacilInt();
                menuPrincipal.setVisible(true); // Abre o menu principal novamente
            }
        });



        // Adicionando um retorno ao apertar no botão de apostar
        btnApostar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Capturando o número enviado pelo usuário
                try {
                    numeroApostado = Integer.parseInt(textFieldNumero.getText());
                    if (numeroApostado < 0 || numeroApostado > 100) {
                        JOptionPane.showMessageDialog(null, "Erro. Informe um número entre 0 e 100.");
                    } else {
                        Random gerador = new Random();
                        int numeroSorteado = gerador.nextInt(101);
                        String mensagemResultado;

                        if (numeroApostado == numeroSorteado) {
                            mensagemResultado = "Parabéns! Você acertou e ganhou R$1.000,00";
                        } else {
                            mensagemResultado = "Que pena! Você errou! Seu número foi: " + numeroApostado
                                + "\nO número sorteado foi: " + numeroSorteado;
                        }
                        
                        JOptionPane.showMessageDialog(null, mensagemResultado);
                    }
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Erro. Informe um número válido.");
                }
            }
        });
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    MenuAposta0a100 window = new MenuAposta0a100();
                    window.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
}
