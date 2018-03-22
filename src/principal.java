import javax.swing.*;
import java.awt.*;
import javax.swing.border.TitledBorder;

public class principal extends JFrame {

    //Declarar variables del panel norte
    private JLabel marca, linea, modelo, valor;
    private JTextField marca1, linea1, modelo1, valor1;
    private JButton buscar;

    //Declarar variables del panel centro
    private JCheckBox pago, traslado, servicio;

    //Declarar variables del panel sur
    private JLabel total;
    private JTextField cantidad;
    private JButton limpiar, calcular;

    public principal() {
        super("Calculo impuestos");
        setLayout(new GridBagLayout());
        GridBagConstraints restricciones = new GridBagConstraints();

        Container contenedorPrincipal = this.getContentPane();
        contenedorPrincipal.setLayout(new GridBagLayout());
        contenedorPrincipal.setBackground(Color.black);

        //Panel del norte creación
        TitledBorder border = new TitledBorder(" Datos del vehiculo ");
        border.setTitleJustification(TitledBorder.LEFT);
        border.setTitlePosition(TitledBorder.TOP);
        JPanel DatosVehiculo = new JPanel();
        DatosVehiculo.setBorder(border);
        DatosVehiculo.setLayout(new GridBagLayout());

        //panel del centro creación
        TitledBorder border2 = new TitledBorder(" Descuentos ");
        border2.setTitleJustification(TitledBorder.LEFT);
        border2.setTitlePosition(TitledBorder.TOP);
        JPanel descuentos = new JPanel();
        descuentos.setBorder(border2);
        descuentos.setLayout(new GridBagLayout());

        //panel del sur creación
        TitledBorder border3 = new TitledBorder(" Resultados ");
        border3.setTitleJustification(TitledBorder.LEFT);
        border3.setTitlePosition(TitledBorder.TOP);
        JPanel resultados = new JPanel();
        resultados.setBorder(border3);
        resultados.setLayout(new GridBagLayout());

        //panel norte contenido
        marca = new JLabel(" Marca ");
        restricciones.gridx = 0;
        restricciones.gridy = 0;
        restricciones.gridheight = 1;
        restricciones.gridwidth = 1;
        restricciones.weightx = 1;
        restricciones.weighty = 0;
        restricciones.anchor = GridBagConstraints.WEST;
        restricciones.insets.set(1,0,5,0);
        restricciones.fill = GridBagConstraints.NONE;
        DatosVehiculo.add(marca, restricciones);

        linea = new JLabel(" Línea ");
        restricciones.gridx = 0;
        restricciones.gridy = 1;
        restricciones.gridheight = 1;
        restricciones.gridwidth = 1;
        restricciones.weightx = 1;
        restricciones.weighty = 0;
        restricciones.anchor = GridBagConstraints.WEST;
        restricciones.insets.set(5,0,5,0);
        restricciones.fill = GridBagConstraints.NONE;
        DatosVehiculo.add(linea, restricciones);

        modelo = new JLabel(" Modelo ");
        restricciones.gridx = 0;
        restricciones.gridy = 2;
        restricciones.gridheight = 1;
        restricciones.gridwidth = 1;
        restricciones.weightx = 1;
        restricciones.weighty = 0;
        restricciones.anchor = GridBagConstraints.WEST;
        restricciones.insets.set(5,0,5,0);
        restricciones.fill = GridBagConstraints.NONE;
        DatosVehiculo.add(modelo, restricciones);

        valor = new JLabel(" Valor ");
        restricciones.gridx = 0;
        restricciones.gridy = 3;
        restricciones.gridheight = 1;
        restricciones.gridwidth = 1;
        restricciones.weightx = 1;
        restricciones.weighty = 0;
        restricciones.anchor = GridBagConstraints.WEST;
        restricciones.insets.set(5,0,5,0);
        restricciones.fill = GridBagConstraints.NONE;
        DatosVehiculo.add(valor, restricciones);

        marca1 = new JTextField("Ingrese la marca");
        restricciones.gridx = 1;
        restricciones.gridy = 0;
        restricciones.gridheight = 1;
        restricciones.gridwidth = 1;
        restricciones.weightx = 1;
        restricciones.weighty = 0;
        restricciones.anchor = GridBagConstraints.EAST;
        restricciones.insets.set(1,0,5,0);
        restricciones.fill = GridBagConstraints.HORIZONTAL;
        DatosVehiculo.add(marca1, restricciones);

        linea1 = new JTextField("Ingrese la línea");
        restricciones.gridx = 1;
        restricciones.gridy = 1;
        restricciones.gridheight = 1;
        restricciones.gridwidth = 1;
        restricciones.weightx = 1;
        restricciones.weighty = 0;
        restricciones.anchor = GridBagConstraints.EAST;
        restricciones.insets.set(5,0,5,0);
        restricciones.fill = GridBagConstraints.HORIZONTAL;
        DatosVehiculo.add(linea1, restricciones);

        modelo1 = new JTextField("Ingrese el modelo");
        restricciones.gridx = 1;
        restricciones.gridy = 2;
        restricciones.gridheight = 1;
        restricciones.gridwidth = 1;
        restricciones.weightx = 1;
        restricciones.weighty = 0;
        restricciones.anchor = GridBagConstraints.EAST;
        restricciones.insets.set(5,0,5,0);
        restricciones.fill = GridBagConstraints.HORIZONTAL;
        DatosVehiculo.add(modelo1, restricciones);

        valor1 = new JTextField("Ingrese el valor");
        restricciones.gridx = 1;
        restricciones.gridy = 3;
        restricciones.gridheight = 1;
        restricciones.gridwidth = 1;
        restricciones.weightx = 1;
        restricciones.weighty = 0;
        restricciones.anchor = GridBagConstraints.EAST;
        restricciones.insets.set(5,0,5,0);
        restricciones.fill = GridBagConstraints.HORIZONTAL;
        DatosVehiculo.add(valor1, restricciones);

        buscar = new JButton("Buscar");
        restricciones.gridx = 1;
        restricciones.gridy = 4;
        restricciones.gridheight = 1;
        restricciones.gridwidth = 1;
        restricciones.weightx = 0;
        restricciones.weighty = 0;
        restricciones.anchor = GridBagConstraints.EAST;
        restricciones.insets.set(1,0,0,0);
        restricciones.fill = GridBagConstraints.HORIZONTAL;
        DatosVehiculo.add(buscar, restricciones);

        //panel norte medidas
        restricciones.gridx = 0;
        restricciones.gridy = 0;
        restricciones.gridheight = 2;
        restricciones.gridwidth = 5;
        restricciones.weightx = 1;
        restricciones.weighty = 1;
        restricciones.fill = GridBagConstraints.BOTH;
        restricciones.anchor = GridBagConstraints.NORTH;
        restricciones.insets.set(0,0,0,0);
        contenedorPrincipal.add(DatosVehiculo, restricciones);

        pago = new JCheckBox("Pronto pago");
        restricciones.gridx = 0;
        restricciones.gridy = 0;
        restricciones.gridheight = 1;
        restricciones.gridwidth = 1;
        restricciones.weightx = 0;
        restricciones.weighty = 0;
        restricciones.fill = GridBagConstraints.HORIZONTAL;
        restricciones.anchor = GridBagConstraints.EAST;
        restricciones.insets.set(0,0,2,0);
        descuentos.add(pago, restricciones);

        traslado = new JCheckBox("Traslado de cuenta");
        restricciones.gridx = 1;
        restricciones.gridy = 0;
        restricciones.gridheight = 1;
        restricciones.gridwidth = 1;
        restricciones.weightx = 0;
        restricciones.weighty = 0;
        restricciones.fill = GridBagConstraints.HORIZONTAL;
        restricciones.anchor = GridBagConstraints.EAST;
        restricciones.insets.set(0,0,2,0);
        descuentos.add(traslado, restricciones);

        servicio = new JCheckBox("Traslado Servicio público");
        restricciones.gridx = 0;
        restricciones.gridy = 1;
        restricciones.gridheight = 1;
        restricciones.gridwidth = 1;
        restricciones.weightx = 0;
        restricciones.weighty = 0;
        restricciones.fill = GridBagConstraints.HORIZONTAL;
        restricciones.anchor = GridBagConstraints.EAST;
        restricciones.insets.set(0,0,2,0);
        descuentos.add(servicio, restricciones);

        //panel centro medidas
        restricciones.gridx = 0;
        restricciones.gridy = 6;
        restricciones.gridheight = 2;
        restricciones.gridwidth = 2;
        restricciones.weightx = 1;
        restricciones.weighty = 1;
        restricciones.fill = GridBagConstraints.BOTH;
        restricciones.anchor = GridBagConstraints.CENTER;
        restricciones.insets.set(0,0,0,0);
        contenedorPrincipal.add(descuentos, restricciones);

        //Panel sur contenido
        total = new JLabel("Total a pagar: ");
        restricciones.gridx = 0;
        restricciones.gridy = 1;
        restricciones.gridheight = 1;
        restricciones.gridwidth = 1;
        restricciones.weightx = 1;
        restricciones.weighty = 0;
        restricciones.fill = GridBagConstraints.HORIZONTAL;
        restricciones.anchor = GridBagConstraints.WEST;
        restricciones.insets.set(0,0,2,0);
        resultados.add(total, restricciones);

        cantidad = new JTextField("cantidad a pagar");
        restricciones.gridx = 1;
        restricciones.gridy = 1;
        restricciones.gridheight = 1;
        restricciones.gridwidth = 1;
        restricciones.weightx = 1;
        restricciones.weighty = 0;
        restricciones.fill = GridBagConstraints.BOTH;
        restricciones.anchor = GridBagConstraints.CENTER;
        restricciones.insets.set(0,0,2,0);
        resultados.add(cantidad, restricciones);

        limpiar = new JButton("Limpiar");
        restricciones.gridx = 3;
        restricciones.gridy = 0;
        restricciones.gridheight = 1;
        restricciones.gridwidth = 1;
        restricciones.weightx = 0;
        restricciones.weighty = 0;
        restricciones.anchor = GridBagConstraints.EAST;
        restricciones.insets.set(1,0,0,0);
        restricciones.fill = GridBagConstraints.HORIZONTAL;
        resultados.add(limpiar, restricciones);

        calcular = new JButton("Calcular");
        restricciones.gridx = 3;
        restricciones.gridy = 1;
        restricciones.gridheight = 1;
        restricciones.gridwidth = 1;
        restricciones.weightx = 1;
        restricciones.weighty = 0;
        restricciones.anchor = GridBagConstraints.EAST;
        restricciones.insets.set(1,0,0,0);
        restricciones.fill = GridBagConstraints.HORIZONTAL;
        resultados.add(calcular, restricciones);

        //panel sur medidas
        restricciones.gridx = 0;
        restricciones.gridy = 8;
        restricciones.gridheight = 3;
        restricciones.gridwidth = 2;
        restricciones.weightx = 1;
        restricciones.weighty = 1;
        restricciones.fill = GridBagConstraints.BOTH;
        restricciones.anchor = GridBagConstraints.SOUTH;
        restricciones.insets.set(0,0,0,0);
        contenedorPrincipal.add(resultados, restricciones);

    }
    public static void main (String[] args){
        principal ventana = new principal();
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setLocationRelativeTo(null);
        ventana.setVisible(true);
        ventana.pack();
    }
}
