/***********************************************************************

	This file is part of KEEL-software, the Data Mining tool for regression, 
	classification, clustering, pattern mining and so on.

	Copyright (C) 2004-2010
	
	F. Herrera (herrera@decsai.ugr.es)
    L. Sánchez (luciano@uniovi.es)
    J. Alcalá-Fdez (jalcala@decsai.ugr.es)
    S. García (sglopez@ujaen.es)
    A. Fernández (alberto.fernandez@ujaen.es)
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

package keel.GraphInterKeel.datacf.visualizeData;

import keel.GraphInterKeel.datacf.util.Attribute;
import keel.GraphInterKeel.datacf.util.KeelFileFilter;
import keel.GraphInterKeel.datacf.util.Dataset;
import org.core.Files;
import keel.GraphInterKeel.util.Path;
import java.io.File;
import java.util.Vector;
import javax.swing.JFileChooser;
import javax.swing.JFrame;

/**
 * <p>
 * @author Written by Juan Carlos Fernández and Pedro Antonio Gutiérrez(University of Córdoba) 23/10/2008
 * @version 1.0
 * @since JDK1.5
 * </p>
 */
public class VisualizePanel extends javax.swing.JPanel {

    /**
     * <p>
     * Class for visualizing dataset
     * </p>
     */

    /**
     * <p>
     * Constructor that initializes the panel
     * </p>
     */
    public VisualizePanel() {
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

        visualizationjTabbedPane = new javax.swing.JTabbedPane();
        visualizePanelDataset = new keel.GraphInterKeel.datacf.visualizeData.VisualizePanelDataset();
        visualizePanelAttribute = new keel.GraphInterKeel.datacf.visualizeData.VisualizePanelAttribute();
        visualizePanelCharts2D = new keel.GraphInterKeel.datacf.visualizeData.VisualizePanelCharts2D();
        loadDatasetjPanel = new javax.swing.JPanel();
        loadjLabel = new javax.swing.JLabel();
        pathLoadjTextField = new javax.swing.JTextField();
        browserjButton = new javax.swing.JButton();

        setName("Form"); // NOI18N

        visualizationjTabbedPane.setName("visualizationjTabbedPane"); // NOI18N

        visualizePanelDataset.setName("visualizePanelDataset"); // NOI18N
        visualizationjTabbedPane.addTab("DataSet View", visualizePanelDataset);

        visualizePanelAttribute.setName("visualizePanelAttribute"); // NOI18N
        visualizationjTabbedPane.addTab("Attribute Info", visualizePanelAttribute);

        visualizePanelCharts2D.setName("visualizePanelCharts2D"); // NOI18N
        visualizationjTabbedPane.addTab("Charts 2D", visualizePanelCharts2D);

        loadDatasetjPanel.setName("loadDatasetjPanel"); // NOI18N

        loadjLabel.setText("Load Dataset:");
        loadjLabel.setName("loadjLabel"); // NOI18N

        pathLoadjTextField.setEditable(false);
        pathLoadjTextField.setName("pathLoadjTextField"); // NOI18N

        browserjButton.setText("...");
        browserjButton.setToolTipText("Open dataset to visualize");
        browserjButton.setName("browserjButton"); // NOI18N
        browserjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                browserjButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout loadDatasetjPanelLayout = new javax.swing.GroupLayout(loadDatasetjPanel);
        loadDatasetjPanel.setLayout(loadDatasetjPanelLayout);
        loadDatasetjPanelLayout.setHorizontalGroup(
            loadDatasetjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loadDatasetjPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(loadjLabel)
                .addGap(12, 12, 12)
                .addComponent(pathLoadjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(browserjButton)
                .addContainerGap(242, Short.MAX_VALUE))
        );
        loadDatasetjPanelLayout.setVerticalGroup(
            loadDatasetjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loadDatasetjPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(loadDatasetjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pathLoadjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(browserjButton)
                    .addComponent(loadjLabel))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(loadDatasetjPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(visualizationjTabbedPane, javax.swing.GroupLayout.DEFAULT_SIZE, 669, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(loadDatasetjPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(visualizationjTabbedPane, javax.swing.GroupLayout.DEFAULT_SIZE, 428, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

private void browserjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_browserjButtonActionPerformed
    this.visualizePanelAttribute.enabledTable(true);

    JFileChooser chooser = new JFileChooser();
    KeelFileFilter fileFilter = new KeelFileFilter();
    fileFilter.addExtension("dat");
    fileFilter.setFilterName("Data Files");
    chooser.setFileFilter(fileFilter);
    chooser.setCurrentDirectory(Path.getFilePath());
    int opcion = chooser.showOpenDialog(this);
    Path.setFilePath(chooser.getCurrentDirectory());

    String cadena = null;
    if (opcion == JFileChooser.APPROVE_OPTION) {
        try {
            cadena = Path.getPath() + File.separator + chooser.getSelectedFile().getName();
            data = new Dataset(cadena);
        } catch (Exception exc) {
        }
        // Show file content
        String cont = Files.readFile(cadena);
        this.visualizePanelDataset.setTextData(cont);
        this.visualizePanelDataset.setCaret(0);
        // Fill table and combobox with attributes
        if (this.visualizePanelAttribute.getTMtablaAtributos().getRowCount() != 0) {
            this.visualizePanelAttribute.clearTable();
            //this.visualizePanelAttribute.getTMtablaAtributos().clearTable();
        }
        this.visualizePanelCharts2D.deteleteAttributes1();
        this.visualizePanelCharts2D.deteleteAttributes2();
        Vector att = data.getAttributes();
        Vector tipos = data.getTypes();
        Vector in = data.getInputs();
        Vector out = data.getOutputs();
        for (int i = 0; i < att.size(); i++) {
            // Table
            Attribute a = null;
            Vector nuevoAtributo = new Vector();
            nuevoAtributo.add(att.elementAt(i));
            nuevoAtributo.add(tipos.elementAt(i));
            if (in.contains(att.elementAt(i))) {
                nuevoAtributo.add(new String("input"));
            } else if (out.contains(att.elementAt(i))) {
                nuevoAtributo.add(new String("output"));
            } else {
                nuevoAtributo.add(new String(""));
            }
            this.visualizePanelAttribute.getTMtablaAtributos().insertRow(nuevoAtributo, a);
            // Combobox
            if (data.getAttributeTypeIndex(i).equals("nominal")) {
                this.visualizePanelCharts2D.addAtribute1((new String(att.elementAt(i).toString() + " (nominal)")));
                this.visualizePanelCharts2D.addAtribute2((new String(att.elementAt(i).toString() + " (nominal)")));
                if (out.contains(att.elementAt(i))) {
                    outAttribute = i;
                }
            } else {
                this.visualizePanelCharts2D.addAtribute1(new String(att.elementAt(i).toString()));
                this.visualizePanelCharts2D.addAtribute2(new String(att.elementAt(i).toString()));
                if (out.contains(att.elementAt(i))) {
                    outAttribute = -1;
                }
            }
        }
        this.visualizePanelAttribute.setLeftValueRank("");
        this.visualizePanelAttribute.setRightValueRank("");
        this.visualizePanelAttribute.setValueAverage("");
        this.visualizePanelAttribute.setValueVariance("");
        this.visualizePanelAttribute.setNominalValues("");
        this.visualizePanelAttribute.setChart(null);
        this.visualizePanelAttribute.setNominalValues("");
        this.visualizePanelAttribute.setImage(null);
        this.visualizePanelCharts2D.setChart(null);
        this.visualizePanelCharts2D.setImage(null);
        this.visualizePanelCharts2D.enablePNG(false);
        this.visualizePanelCharts2D.enablePDF(false);
        this.pathLoadjTextField.setText(Path.getPath());
    }
}//GEN-LAST:event_browserjButtonActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton browserjButton;
    private javax.swing.JPanel loadDatasetjPanel;
    private javax.swing.JLabel loadjLabel;
    private javax.swing.JTextField pathLoadjTextField;
    private javax.swing.JTabbedPane visualizationjTabbedPane;
    private keel.GraphInterKeel.datacf.visualizeData.VisualizePanelAttribute visualizePanelAttribute;
    private keel.GraphInterKeel.datacf.visualizeData.VisualizePanelCharts2D visualizePanelCharts2D;
    private keel.GraphInterKeel.datacf.visualizeData.VisualizePanelDataset visualizePanelDataset;
    // End of variables declaration//GEN-END:variables

    /** Parent Frame */
    protected JFrame parent = null;

    /** Dataset */
    protected Dataset data;

    /** Output attribute */
    protected int outAttribute = -1;

    /**
     * <p>
     * Sets the parent JFrame
     * </p>
     * @param parent Parent JFrame
     */
    public void setParent(JFrame parent) {
        this.parent = parent;
    }

    /**
     * <p>
     * Gets a Datasets
     * </p>
     * @return Dataset
     */
    public Dataset getData() {
        return this.data;
    }

    /**
     * <p>
     * Sets a Dataset
     * </p>
     * @param data
     */
    public void setData(Dataset data) {
        this.data = data;
    }

    /**
     * <p>
     * Sets output attribute
     * </p>
     * @param value Index of the output attribute
     */
    public void setOutAttribute(int value) {
        this.outAttribute = value;
    }

    /**
     * <p>
     * Returns the index of the output attribute
     * </p>
     * @return int Index of the output attribute
     */
    public int getOutAttribute() {
        return this.outAttribute;
    }
}
