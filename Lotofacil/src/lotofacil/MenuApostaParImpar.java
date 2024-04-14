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

public class MenuApostaParImpar extends JFrame {
    private JTextField textFieldNumero;
    private int numeroApostado;

    public MenuApostaParImpar() {
        initialize();
    }

    private void initialize() {
        setTitle("Apostar em Par ou Ímpar");
        setSize(400, 300); // Tamanho da janela ajustado para 400x300 pixels
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        JLabel lblInstrucao = new JLabel("Digite um número inteiro:");
        lblInstrucao.setBounds(130, 56, 200, 30);
        getContentPane().add(lblInstrucao);

        // Adicionando JTextField para o número
        textFieldNumero = new JTextField();
        textFieldNumero.setBounds(125, 100, 130, 30); // Ajuste de tamanho para o JTextField do número
        textFieldNumero.setBackground(Color.WHITE); // Cor de fundo
        textFieldNumero.setBorder(javax.swing.BorderFactory.createLineBorder(Color.BLACK)); // Borda preta
        textFieldNumero.setFont(new Font("Arial", Font.PLAIN, 14)); // Tamanho e estilo da fonte
        getContentPane().add(textFieldNumero);

        // Criando o botão de apostar
        JButton btnApostar = new JButton("Apostar");
        btnApostar.setBounds(113, 150, 87, 30);
        getContentPane().add(btnApostar);
        
        // Criando o botão de voltar ao menu principal
        JButton btnVoltar = new JButton("Voltar");
        btnVoltar.setBounds(210, 150, 87, 30);
        getContentPane().add(btnVoltar);
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
                    int numeroApostado = Integer.parseInt(textFieldNumero.getText());

                    if (numeroApostado % 2 == 0) {
                        JOptionPane.showMessageDialog(null, "O número " + numeroApostado + " é par.\nParabéns! Você ganhou R$100,00");
                    } else {
                        JOptionPane.showMessageDialog(null, "O número " + numeroApostado + " é ímpar.\nQue pena, você perdeu. A premiação era apenas para números pares.");
                    }
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Erro. Informe um número inteiro válido.");
                }
            }
        });
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    MenuApostaParImpar window = new MenuApostaParImpar();
                    window.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
}
