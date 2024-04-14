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


public class MenuApostaAaZ extends JFrame {
    private JTextField textFieldNumero;
    private JTextField textFieldLetra; // Adicionando JTextField para a letra
    private int numeroApostado;
    private char letraPremiada = 'G'; // Letra premiada para teste

    public MenuApostaAaZ() {
        initialize();
    }

    private void initialize() {
        setTitle("Apostar de A a Z");
        setSize(400, 300); // Tamanho da janela ajustado para 400x300 pixels
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        JLabel lblInstrucao = new JLabel("Digite uma letra de A a Z:");
        lblInstrucao.setBounds(130, 56, 200, 30);
        getContentPane().add(lblInstrucao);

        // Adicionando JTextField para a letra
        textFieldLetra = new JTextField();
        textFieldLetra.setBounds(125, 100, 130, 30); // Ajuste de tamanho para o JTextField da letra
        textFieldLetra.setBackground(Color.WHITE); // Cor de fundo
        textFieldLetra.setBorder(javax.swing.BorderFactory.createLineBorder(Color.BLACK)); // Borda preta
        textFieldLetra.setFont(new Font("Arial", Font.PLAIN, 14)); // Tamanho e estilo da fonte
        getContentPane().add(textFieldLetra);

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
                // Capturando a letra enviada pelo usuário
                try {
                    char letraAposta = Character.toUpperCase(textFieldLetra.getText().charAt(0));

                    if (Character.isLetter(letraAposta)) {
                        if (letraAposta == letraPremiada) {
                            JOptionPane.showMessageDialog(null, "Parabéns! Você acertou e ganhou R$500,00 reais.");
                        } else {
                            JOptionPane.showMessageDialog(null, "Que pena, você errou! A letra sorteada foi: " + letraPremiada);
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Aposta inválida. Digite uma letra de A a Z.");
                    }
                } catch (IndexOutOfBoundsException ex) {
                    JOptionPane.showMessageDialog(null, "Campo vazio. Digite uma letra de A a Z.");
                }
            }
        });
    }

}
