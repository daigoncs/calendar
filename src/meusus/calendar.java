package meusus;

public class calendar extends javax.swing.JFrame {

    private int month;
    private int year;
    
    public calendar(int month, int year) {
        initComponents();
        this.month=month;
        this.year=year;
        init();
    }
    
    private void init() {
        segunda.asTitle();
        terca.asTitle();
        quarta.asTitle();
        quinta.asTitle();
        sexta.asTitle();
        sabado.asTitle();
        domingo.asTitle();
        setDate();
    }

    private void setDate(){
        calendar calendar=calendar.getInstance();
        calendar.set(calendar.YEAR, year);
        calendar.set(calendar.MONTH, month-1);
        calendar.set(calendar.DATE, 1);
        int startDay=calendar.get(calendar.DAY_OF_WEEK) -1;
        calendar.add(calendar.DATE, -startDay);
        for(component com:getComponents()) {
            Cell cell=(cell)com;
            if(!cell.isTitle())
                cell.setText(calendar.DATE);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.GridLayout(7, 7));

        pack();
    }// </editor-fold>//GEN-END:initComponents


    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new calendar().setVisible(true);
            }
        });
    }

    private static class segunda {

        private static void asTitle() {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        public segunda() {
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
