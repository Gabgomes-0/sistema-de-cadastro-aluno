
    import javax.swing.*;

    public class TelaCadastro extends JFrame {
        // Declaração dos Componentes de Interface Gráfica (Etapa 3 + Desafio Extra 1)
        private JLabel labelNome, labelEmail, labelCPF, labelIdade, labelTelefone;
        private JTextField campoNome, campoEmail, campoCPF, campoIdade, campoTelefone;
        private JButton botaoSalvar, botaoLimpar, botaoFechar;
        private JLabel labelContador; // Desafio Extra 3

        // Variável para armazenar o total de cadastros (Desafio Extra 3)
        private int contadorCadastros = 0;

        public TelaCadastro() {
            // Configurações Iniciais do JFrame (Etapa 3)
            setTitle("Cadastro de Aluno");
            setSize(400, 400); // Tamanho ajustado para novos campos
            setLayout(null); // Layout nulo para posicionamento manual (setBounds)
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Fechar a aplicação ao clicar no 'X'

            // Inicialização dos Componentes (Etapa 3 + Desafio Extra 1)
            labelNome = new JLabel("Nome:");
            campoNome = new JTextField();
            labelEmail = new JLabel("Email:");
            campoEmail = new JTextField();

            // Novos campos (Desafio Extra 1)
            labelCPF = new JLabel("CPF:");
            campoCPF = new JTextField();
            labelIdade = new JLabel("Idade:");
            campoIdade = new JTextField();
            labelTelefone = new JLabel("Telefone:");
            campoTelefone = new JTextField();

            botaoSalvar = new JButton("Salvar");
            botaoLimpar = new JButton("Limpar");

            // Novo botão (Desafio Extra 2)
            botaoFechar = new JButton("Fechar");

            // Label para o contador (Desafio Extra 3)
            labelContador = new JLabel("Cadastros feitos: 0");

            // Posicionamento e Tamanho dos Componentes (setBounds)
            int x = 30; // Posição X inicial
            int y = 30; // Posição Y inicial
            int larguraLabel = 80;
            int larguraCampo = 250;
            int alturaComponente = 25;
            int espacoEntreLinhas = 35;

            // Nome
            labelNome.setBounds(x, y, larguraLabel, alturaComponente);
            campoNome.setBounds(x + larguraLabel, y, larguraCampo, alturaComponente);
            y += espacoEntreLinhas;

            // Email
            labelEmail.setBounds(x, y, larguraLabel, alturaComponente);
            campoEmail.setBounds(x + larguraLabel, y, larguraCampo, alturaComponente);
            y += espacoEntreLinhas;

            // CPF (Desafio Extra 1)
            labelCPF.setBounds(x, y, larguraLabel, alturaComponente);
            campoCPF.setBounds(x + larguraLabel, y, larguraCampo, alturaComponente);
            y += espacoEntreLinhas;

            // Idade (Desafio Extra 1)
            labelIdade.setBounds(x, y, larguraLabel, alturaComponente);
            campoIdade.setBounds(x + larguraLabel, y, larguraCampo, alturaComponente);
            y += espacoEntreLinhas;

            // Telefone (Desafio Extra 1)
            labelTelefone.setBounds(x, y, larguraLabel, alturaComponente);
            campoTelefone.setBounds(x + larguraLabel, y, larguraCampo, alturaComponente);
            y += espacoEntreLinhas + 10;

            // Botões
            int larguraBotao = 100;
            int espacoEntreBotoes = 15;
            botaoSalvar.setBounds(x, y, larguraBotao, alturaComponente);
            botaoLimpar.setBounds(x + larguraBotao + espacoEntreBotoes, y, larguraBotao, alturaComponente);
            botaoFechar.setBounds(x + 2 * (larguraBotao + espacoEntreBotoes), y, larguraBotao, alturaComponente); // Desafio Extra 2
            y += espacoEntreLinhas + 10;

            // Contador
            labelContador.setBounds(x, y, larguraCampo + larguraLabel, alturaComponente); // Desafio Extra 3

            // Adição dos Componentes ao JFrame
            add(labelNome); add(campoNome);
            add(labelEmail); add(campoEmail);
            add(labelCPF); add(campoCPF);
            add(labelIdade); add(campoIdade);
            add(labelTelefone); add(campoTelefone);
            add(botaoSalvar); add(botaoLimpar);
            add(botaoFechar);
            add(labelContador);

            // --- Etapa 4 - Criando as Funcionalidades (Ações dos botões) ---

            // Ação do botão SALVAR
            botaoSalvar.addActionListener(e -> {
                String nome = campoNome.getText();
                String email = campoEmail.getText();
                String cpf = campoCPF.getText();
                String idade = campoIdade.getText();
                String telefone = campoTelefone.getText();

                // Exibir os dados simulando um cadastro (Etapa 5)
                String mensagem = "Cadastro realizado!\n" +
                        "Nome: " + nome + "\n" +
                        "Email: " + email + "\n" +
                        "CPF: " + cpf + "\n" +
                        "Idade: " + idade + "\n" +
                        "Telefone: " + telefone;

                JOptionPane.showMessageDialog(this, mensagem, "Sucesso", JOptionPane.INFORMATION_MESSAGE);

                // Atualiza o contador de cadastros (Desafio Extra 3)
                contadorCadastros++;
                labelContador.setText("Cadastros feitos: " + contadorCadastros);
            });

            // Ação do botão LIMPAR
            botaoLimpar.addActionListener(e -> {
                campoNome.setText("");
                campoEmail.setText("");
                campoCPF.setText("");
                campoIdade.setText("");
                campoTelefone.setText("");
            });

            // Ação do botão FECHAR (Desafio Extra 2)
            botaoFechar.addActionListener(e -> {
                System.exit(0); // Encerra o sistema
            });

            // Torna a janela visível
            setVisible(true);
        }
    }

