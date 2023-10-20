import antlr4.br.edu.unifg.compiladores.progmatic.ProgMaticLexer;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.Token;

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class TokenReader {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Token Visualizer");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(700, 400);

        JMenuBar menuBar = new JMenuBar();
        JMenu fileMenu = new JMenu("Files");
        JMenuItem openMenuItem = new JMenuItem("Open files");
        fileMenu.add(openMenuItem);
        menuBar.add(fileMenu);
        frame.setJMenuBar(menuBar);

        JTextArea textArea = new JTextArea();
        textArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(textArea);
        frame.add(scrollPane);

        openMenuItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JFileChooser fileChooser = new JFileChooser(System.getProperty("user.dir"));

                FileNameExtensionFilter filter = new FileNameExtensionFilter("Source files", "pm","txt", "java");
                fileChooser.setFileFilter(filter);

                int result = fileChooser.showOpenDialog(frame);

                if (result == JFileChooser.APPROVE_OPTION) {
                    try {
                        textArea.setText("");
                        InputStream is = new FileInputStream(fileChooser.getSelectedFile());
                        CharStream stream = CharStreams.fromStream(is);
                        ProgMaticLexer lexer = new ProgMaticLexer(stream);
                        Token t = null;
                        while ((t = lexer.nextToken()).getType() != Token.EOF) {
                            String tokenName = ProgMaticLexer.ruleNames[t.getType() - 1];
                            textArea.append("<" + tokenName + "," + t.getText() + ">\n");
                        }
                    } catch (IOException ex) {
                        JOptionPane.showMessageDialog(frame, "Error when accessing file: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                    }
                }
            }
        });

        frame.setVisible(true);
    }
}
