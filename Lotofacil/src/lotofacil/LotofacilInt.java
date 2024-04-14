package lotofacil;

import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LotofacilInt {

    private JFrame frame;

    // Inicia a aplicação
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    LotofacilInt window = new LotofacilInt();
                    window.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    // Cria a aplicação
    public LotofacilInt() {
        initialize();
    }

    // Inicia o conteúdo da janela
    private void initialize() {
        frame = new JFrame();
        frame.setBounds(100, 100, 450, 372); // Ajuste de tamanho para acomodar a imagem
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);

        // Criando a imagem e adicionando à janela
        ImageIcon imagem = new ImageIcon("C:\\Users\\Splendo\\eclipse-workspace\\Lotofacil\\Parte_de_volante_da_Lotofácil.jpg");
        JLabel lblImagem = new JLabel(imagem);
        lblImagem.setBounds(173, 60, 100, 100); // Posicionamento da imagem
        frame.getContentPane().add(lblImagem);

        // Criando o menu
        JLabel lblMenu = new JLabel("Menu Lotofácil");
        lblMenu.setBounds(184, 10, 100, 14);
        frame.getContentPane().add(lblMenu);

        // Criando a instrução para iniciar o jogo
        JLabel lblMenu2 = new JLabel("Para começar a jogar, escolha uma opção abaixo:");
        lblMenu2.setBounds(110, 170, 300, 50); // Posicionamento alterado para abaixo da imagem
        frame.getContentPane().add(lblMenu2);

        // Criando o botão do primeiro jogo
        JButton btnApostarDe0a100 = new JButton("Apostar de 0 à 100");
        btnApostarDe0a100.setBounds(125, 230, 200, 23);
        frame.getContentPane().add(btnApostarDe0a100);
        // Adicionando uma ação ao botão da primeira aposta
        btnApostarDe0a100.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Chamando a classe do Menu para a aposta, separado
                MenuAposta0a100 menuAposta = new MenuAposta0a100();
                menuAposta.setVisible(true);
            }
        });

        // Criando o botão do segundo jogo
        JButton btnApostarDeAaZ = new JButton("Apostar de A à Z");
        btnApostarDeAaZ.setBounds(125, 260, 200, 23);
        frame.getContentPane().add(btnApostarDeAaZ);
        // Adicionando uma ação ao botão da segunda aposta
        btnApostarDeAaZ.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Chamando a classe do Menu para a aposta, separado
                MenuApostaAaZ menuAposta = new MenuApostaAaZ();
                menuAposta.setVisible(true);
            }
        });

        // Criando o botão do terceiro jogo
        JButton btnApostarParImpar = new JButton("Apostar em par ou ímpar");
        btnApostarParImpar.setBounds(125, 290, 200, 23);
        frame.getContentPane().add(btnApostarParImpar);
        // Adicionando uma ação ao botão da terceira aposta
        btnApostarParImpar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Chamando a classe do Menu para a aposta, separado
                MenuApostaParImpar menuAposta = new MenuApostaParImpar();
                menuAposta.setVisible(true);
            }
        });

    }

    public void setVisible(boolean b) {
        // TODO Auto-generated method stub
    }

}
