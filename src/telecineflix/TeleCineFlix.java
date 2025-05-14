package telecineflix;
import Interface.CadastroTeleFlix;

public class TeleCineFlix {
    
    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    CadastroTeleFlix frame = new CadastroTeleFlix();
                    frame.setVisible(true);
                    frame.setLocationRelativeTo(null); // Centraliza a janela
                    System.out.println("InterfaceFlix exibida com sucesso");
                } catch (Exception e) {
                    e.printStackTrace();
                    System.out.println("Erro ao exibir a interface: " + e.getMessage());
                }
            }
        });
    }
    
}
