/***********************************************************************

	This file is part of KEEL-software, the Data Mining tool for regression, 
	classification, clustering, pattern mining and so on.

	Copyright (C) 2004-2010
	
	F. Herrera (herrera@decsai.ugr.es)
    L. S�nchez (luciano@uniovi.es)
    J. Alcal�-Fdez (jalcala@decsai.ugr.es)
    S. Garc�a (sglopez@ujaen.es)
    A. Fern�ndez (alberto.fernandez@ujaen.es)
    J. Luengo (julianlm@decsai.ugr.es)

	This program is free software: you can redistribute it and/or modify
	it under the terms of the GNU General Public License as published by
	the Free Software Foundation, either version 3 of the License, or
	(at your option) any later version.

	This program is distributed in the hope that it will be useful,
	but WITHOUT ANY WARRANTY; without even the implied warranty of
	MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
	GNU General Public License for more details.

	You should have received a copy of the GNU General Public License
	along with this program.  If not, see http://www.gnu.org/licenses/
  
**********************************************************************/

package keel.GraphInterKeel.datacf.editData;

import org.core.Files;
import keel.GraphInterKeel.datacf.util.KeelFileFilter;
import keel.GraphInterKeel.util.Path;
import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import keel.GraphInterKeel.datacf.DataCFFrame;

/**
 * <p>
 * @author Written by Juan Carlos Fernández and Pedro Antonio Gutiérrez (University of Córdoba) 23/10/2008
 * @version 1.0
 * @since JDK1.5
 * </p>
 */
public class EditPanel extends javax.swing.JPanel {

    /**
     * <p>
     * Class for editing a dataset
     * </p>
     */


    /**
     * <p>
     * Constructor that initializes the panel
     * </p>
     */
    public EditPanel() {
        initComponents();
    }

    /**
     * <p>
     * This method is called from within the constructor to
     * initialize the form.
     * </p>
     * <p>
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     * </p>
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        editjTabbedPane = new javax.swing.JTabbedPane();
        editDataPanel = new keel.GraphInterKeel.datacf.editData.EditDataPanel();
        editVariablePanel = new keel.GraphInterKeel.datacf.editData.EditVariablePanel();
        loadjPanel = new javax.swing.JPanel();
        loadjLabel = new javax.swing.JLabel();
        browserjButton = new javax.swing.JButton();
        loadjTextField = new javax.swing.JTextField();
        savejButton = new javax.swing.JButton();

        setName("Form"); // NOI18N

        editjTabbedPane.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Edition"));
        editjTabbedPane.setName("editjTabbedPane"); // NOI18N

        editDataPanel.setName("editDataPanel"); // NOI18N
        editjTabbedPane.addTab("Data", editDataPanel);

        editVariablePanel.setName("editVariablePanel"); // NOI18N
        editjTabbedPane.addTab("Variables", editVariablePanel);

        loadjPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Load"));
        loadjPanel.setName("loadjPanel"); // NOI18N
        this.editDataPanel.setEditVariablePanel(this.editVariablePanel);
        this.editVariablePanel.setEditDataPanel(this.editDataPanel);

        loadjLabel.setText("Load Dataset");
        loadjLabel.setName("loadjLabel"); // NOI18N

        browserjButton.setText("...");
        browserjButton.setToolTipText("Open Browser");
        browserjButton.setName("browserjButton"); // NOI18N
        browserjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                browserjButtonActionPerformed(evt);
            }
        });

        loadjTextField.setEditable(false);
        loadjTextField.setName("loadjTextField"); // NOI18N

        savejButton.setText("Save");
        savejButton.setToolTipText("Save Dataa");
        savejButton.setMaximumSize(new java.awt.Dimension(63, 23));
        savejButton.setMinimumSize(new java.awt.Dimension(63, 23));
        savejButton.setName("savejButton"); // NOI18N
        savejButton.setPreferredSize(new java.awt.Dimension(63, 23));
        savejButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                savejButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout loadjPanelLayout = new javax.swing.GroupLayout(loadjPanel);
        loadjPanel.setLayout(loadjPanelLayout);
        loadjPanelLayout.setHorizontalGroup(
            loadjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loadjPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(loadjLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(loadjTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 222, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(browserjButton)
                .addGap(18, 18, 18)
                .addComponent(savejButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        loadjPanelLayout.setVerticalGroup(
            loadjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loadjPanelLayout.createSequentialGroup()
                .addGroup(loadjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(loadjLabel)
                    .addComponent(savejButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(browserjButton)
                    .addComponent(loadjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(loadjPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(editjTabbedPane, javax.swing.GroupLayout.DEFAULT_SIZE, 458, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(loadjPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(editjTabbedPane, javax.swing.GroupLayout.DEFAULT_SIZE, 314, Short.MAX_VALUE))
        );

        org.jdesktop.application.ResourceMap resourceMap = org.jdesktop.application.Application.getInstance(keel.GraphInterKeel.datacf.DataCFApp.class).getContext().getResourceMap(EditPanel.class);
        editjTabbedPane.getAccessibleContext().setAccessibleName(resourceMap.getString("editjTabbedPane.AccessibleContext.accessibleName")); // NOI18N
    }// </editor-fold>//GEN-END:initComponents

private void browserjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_browserjButtonActionPerformed
    JFileChooser chooser = new JFileChooser();
    KeelFileFilter fileFilter = new KeelFileFilter();
    fileFilter.addExtension("dat");
    fileFilter.setFilterName("Data Files");
    chooser.setFileFilter(fileFilter);
    chooser.setCurrentDirectory(Path.getFilePath());
    int opcion = chooser.showOpenDialog(this);
    Path.setFilePath(chooser.getCurrentDirectory());

    if (opcion == JFileChooser.APPROVE_OPTION)
        this.loadFile(chooser.getSelectedFile(), false);
}//GEN-LAST:event_browserjButtonActionPerformed

/**
 * <p>
 * Loads a new file in the tab
 * </p>
 * @param file The new file
 * @param showPartition A boolean indicating if you want to show a dialog
 *                      for making partitions, after editing the file.
 */
public void loadFile(File file, boolean showPartition){
        this.editDataPanel.setDataSet(file.getAbsolutePath());
        this.editDataPanel.setStateAddButton(true);
        this.editVariablePanel.setStateAddButton(true);
        this.editVariablePanel.setCounter(0);
        this.loadjTextField.setText(file.getAbsolutePath());
        this.showPartition = showPartition;
}

private void savejButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_savejButtonActionPerformed

    if (this.editDataPanel.getData().getAttributes().size() == 0) {
        JOptionPane.showMessageDialog(this, "Please, insert at least one variable", "Error", 2);
        return;
    }

    JFileChooser chooser = new JFileChooser();
    KeelFileFilter fileFilter = new KeelFileFilter();
    fileFilter.addExtension("dat");
    fileFilter.setFilterName("KEEL Files (.dat)");
    chooser.setFileFilter(fileFilter);
    chooser.setCurrentDirectory(Path.getFilePath());
    if(!this.loadjTextField.getText().equals(""))
        chooser.setSelectedFile(new File(this.loadjTextField.getText()));

    int opcion = chooser.showSaveDialog(this);
    Path.setFilePath(chooser.getCurrentDirectory());

    String cadena, aux;
    boolean ok;
    if (opcion == JFileChooser.APPROVE_OPTION && this.editDataPanel.getStateAddButton()) {
        String nombre = chooser.getSelectedFile().getAbsolutePath();
        if (!nombre.toLowerCase().endsWith(".dat") && !nombre.toLowerCase().endsWith(".txt")) {
            // Add correct extension
            nombre += ".dat";
        }
        File tmp = new File(nombre);
        if (!tmp.exists() || JOptionPane.showConfirmDialog(this,
                "File " + nombre + " already exists. Do you want to replace it?", "Confirm",
                JOptionPane.YES_NO_OPTION, 3) == JOptionPane.YES_OPTION) {

            imprimeCabecera(nombre);
            for (int i = 0; i < this.editDataPanel.getTablaDataset().getData().length; i++) {
                cadena = "";
                ok = false;
                for (int j = 0; j < this.editDataPanel.getData().getNVariables(); j++) {
                    if (!ok) {
                        if (this.editDataPanel.getTablaDataset().getData()[i][j] == null ||
                                (this.editDataPanel.getTablaDataset().getData().toString()).equalsIgnoreCase(
                                "<null>")) {
                            cadena += "<null>";
                        } else {
                            cadena += this.editDataPanel.getTablaDataset().getData()[i][j];
                        }
                        ok = true;
                    } else {
                        if (this.editDataPanel.getTablaDataset().getData() == null ||
                                (this.editDataPanel.getTablaDataset().getData().toString()).equalsIgnoreCase(
                                "<null>")) {
                            cadena += ", <null>";
                        } else {
                            cadena += ", " + this.editDataPanel.getTablaDataset().getData()[i][j];
                        }
                    }
                }
                cadena += "\n";
                Files.addToFile(nombre, cadena);
            }
            JOptionPane.showMessageDialog(this, "DataSet created", "Info",
                    JOptionPane.INFORMATION_MESSAGE);

            // Perform partitions?
            if(showPartition){
                Object[] options = {"Yes", "No"};
                int n = JOptionPane.showOptionDialog(parent,
                        "Do you want to make partitions for this dataset?",
                        "Make partitions",
                        JOptionPane.YES_NO_CANCEL_OPTION,
                        JOptionPane.QUESTION_MESSAGE,
                        null,
                        options,
                        options[1]);
                if (n == 0) {
                    if (dataCFFrame != null) {
                        dataCFFrame.addPartitionTab(tmp);
                    }
                }
                showPartition = false;
            }
        }
    }

}//GEN-LAST:event_savejButtonActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton browserjButton;
    private keel.GraphInterKeel.datacf.editData.EditDataPanel editDataPanel;
    private keel.GraphInterKeel.datacf.editData.EditVariablePanel editVariablePanel;
    private javax.swing.JTabbedPane editjTabbedPane;
    private javax.swing.JLabel loadjLabel;
    private javax.swing.JPanel loadjPanel;
    private javax.swing.JTextField loadjTextField;
    private javax.swing.JButton savejButton;
    // End of variables declaration//GEN-END:variables

    // Parent JFrame
    protected JFrame parent = null;
    
    // Boolean indicating if you want to show a final dialog for making partitions of the dataset
    protected boolean showPartition = false;

    /** DataCF parent frame */
    protected DataCFFrame dataCFFrame = null;

    /**
     * <p>
     * Set the JFrame Parent
     * </p>
     * @param parent JFrame parent
     */
    public void setParent(JFrame parent) {
        this.parent = parent;
    }

    /**
     * <p>
     * Sets a view for a dataset
     * </p>
     * @param dataCFFrame View for a dataset
     */
    public void setDataCFView(DataCFFrame dataCFView) {
        this.dataCFFrame = dataCFView;
    }

    private void imprimeCabecera(String nombreFichero) {
        String cadena = "";
        int i, j;

        if (this.editDataPanel.getData().getRelacion().equals("unknow")) {
            cadena += "@relation " + new File(nombreFichero).getName().replaceAll(".dat", "") + "\n";
        } else {
            cadena += "@relation " + this.editDataPanel.getData().getRelacion() + "\n";
        }

        for (i = 0; i < this.editDataPanel.getData().getNVariables(); i++) {
            cadena += "@attribute " + this.editDataPanel.getData().getAttributeIndex(i) + " ";
            if (this.editDataPanel.getData().getAttributeTypeIndex(i).equalsIgnoreCase("nominal")) { //lista
                cadena += "{";
                for (j = 0; j < this.editDataPanel.getData().getRange(i).size(); j++) {
                    cadena += (String) this.editDataPanel.getData().getRange(i).elementAt(j);
                    if (j < this.editDataPanel.getData().getRange(i).size() - 1) {
                        cadena += ", ";
                    }
                }
                cadena += "}\n";
            } else if (this.editDataPanel.getData().getAttributeTypeIndex(i).equalsIgnoreCase("integer")) { //int
                cadena += "integer" + " [" + this.editDataPanel.getData().getRangesInt(i, 0) + ", " +
                        this.editDataPanel.getData().getRangesInt(i, 1) + "]\n";
            } else { //real
                cadena += "real" + " [" + this.editDataPanel.getData().getRangesReal(i, 0) + ", " +
                        this.editDataPanel.getData().getRangesReal(i, 1) + "]\n";
            }
        }

        cadena += "@inputs ";
        boolean poner = false;
        for (j = 0; j < this.editDataPanel.getData().getNInputs(); j++) {
            if (!poner) {
                cadena += (String) (this.editDataPanel.getData().getInputs().elementAt(j));
                poner = true;
            } else {
                cadena += ", " + (String) (this.editDataPanel.getData().getInputs().elementAt(j));
            }
        }
        cadena += "\n";
        cadena += "@outputs ";
        poner = false;
        for (j = 0; j < this.editDataPanel.getData().getNOutputs(); j++) {
            if (!poner) {
                cadena += (String) (this.editDataPanel.getData().getOutputs().elementAt(j));
                poner = true;
            } else {
                cadena += ", " + (String) (this.editDataPanel.getData().getOutputs().elementAt(j));
            }
        }
        cadena += "\n";
        cadena += "@data\n";
        Files.writeFile(nombreFichero, cadena);
    }
}

