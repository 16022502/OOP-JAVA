/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.CardLayout;
import java.awt.Dimension;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.io.Writer;
import java.net.URLEncoder;
import java.util.Scanner;
import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.*;
import view.*;

 import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.scene.transform.Translate;
import org.json.JSONException;

/**
 *
 * @author IT
 */
public class ViewMain extends javax.swing.JFrame{
    Scanner sc = new Scanner(System.in);
    final DefaultListModel model = new DefaultListModel();
    Dictionary dic = new Dictionary();
    public ViewMain() throws IOException {
        initComponents();
        setTitle("Dictionary Application");
        final DefaultListModel model = new DefaultListModel();
        insertFromFile();
        loadTable();
    }    
     
    public void loadTable() {
           int i = 1;
           for (Word word : dic.listWord){
               model.addElement(word.getWord_target());
                i += 1;
                
           }
       JScrollPane scroll = new JScrollPane();       
        scroll.setPreferredSize(new Dimension(1350, 400));        
    }
    
         // ham doc du lieu tu tệp txt
    public void insertFromFile() throws IOException {
//        File file = new File("dictionaries.txt");
//         if(!file.exists()){
//            file.createNewFile();
//        }
         File file = new File("dictionaries.txt");
         BufferedReader in = new BufferedReader(
		   new InputStreamReader(
                      new FileInputStream(file), "UTF8"));
        Scanner sc = new Scanner(in);
        while(sc.hasNextLine()){
            String line = sc.nextLine();
            String[] details = line.split("\t");
            if(details.length <2)
            {
                continue;
            }
            Word word = new Word(details[0], details[1]);
            dic.listWord.add(word);
           
        }  
    }

    public static void main(String args[]) throws IOException {
        ViewMain vm = new ViewMain();
        vm.setExtendedState(JFrame.MAXIMIZED_BOTH);
        vm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        vm.setVisible(true);
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        tfSearch = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnAdd = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        btnRepair = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        tfTu = new javax.swing.JTextField();
        tfDich = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        javax.swing.JList<String> jList2 = new javax.swing.JList<>();
        lMessage = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbShow = new javax.swing.JTable();
        btnLoa = new javax.swing.JButton();
        btnDichO = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(114,206,227));

        tfSearch.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tfSearch.setToolTipText("Nhập từ cần tìm tại đây");
        tfSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfSearchActionPerformed(evt);
            }
        });

        btnSearch.setBackground(new java.awt.Color(204, 204, 255));
        btnSearch.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        btnSearch.setForeground(new java.awt.Color(255, 0, 0));
        btnSearch.setText("search");
        btnSearch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSearchMouseClicked(evt);
            }
        });
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("DICTIONARY ENGLISH");

        jLabel2.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("CopyRight by Quang-Phuoc-Hien");

        btnAdd.setBackground(new java.awt.Color(204, 204, 255));
        btnAdd.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        btnAdd.setForeground(new java.awt.Color(255, 0, 0));
        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnBack.setBackground(new java.awt.Color(204, 204, 255));
        btnBack.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        btnBack.setForeground(new java.awt.Color(255, 0, 0));
        btnBack.setText("Back");
        btnBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBackMouseClicked(evt);
            }
        });
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnRepair.setBackground(new java.awt.Color(204, 204, 255));
        btnRepair.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        btnRepair.setForeground(new java.awt.Color(255, 0, 0));
        btnRepair.setText("Repair");
        btnRepair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRepairActionPerformed(evt);
            }
        });

        btnDelete.setBackground(new java.awt.Color(204, 204, 255));
        btnDelete.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        btnDelete.setForeground(new java.awt.Color(255, 0, 0));
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnExit.setBackground(new java.awt.Color(204, 204, 255));
        btnExit.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        btnExit.setForeground(new java.awt.Color(255, 0, 0));
        btnExit.setText("Exit");
        btnExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnExitMouseClicked(evt);
            }
        });
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        tfTu.setToolTipText("Nhập từ mới tại đây");

        tfDich.setToolTipText("Nhập nghĩa tại đây");
        tfDich.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfDichActionPerformed(evt);
            }
        });

        jList2.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        jList2.setModel(model);
        jList2.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                jList2ValueChanged(evt);
            }
        });
        jScrollPane2.setViewportView(jList2);

        lMessage.setForeground(new java.awt.Color(255, 0, 0));

        tbShow.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        tbShow.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "VOCABULARY", "EXPLAIN"
            }
        ));
        jScrollPane1.setViewportView(tbShow);

        btnLoa.setBackground(new java.awt.Color(0, 255, 102));
        btnLoa.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        btnLoa.setForeground(new java.awt.Color(255, 51, 51));
        btnLoa.setText("Phat am");
        btnLoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoaActionPerformed(evt);
            }
        });

        btnDichO.setBackground(new java.awt.Color(51, 255, 51));
        btnDichO.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        btnDichO.setForeground(new java.awt.Color(255, 51, 51));
        btnDichO.setText("Translate Online");
        btnDichO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDichOActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnSearch)
                                .addGap(54, 54, 54)
                                .addComponent(btnBack)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(btnDichO)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfDich, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfTu, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(53, 53, 53)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnRepair, javax.swing.GroupLayout.DEFAULT_SIZE, 87, Short.MAX_VALUE)
                            .addComponent(btnAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnExit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnDelete, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE))
                        .addGap(29, 29, 29))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 553, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnLoa, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 17, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(117, 117, 117))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(414, 414, 414)
                .addComponent(lMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 463, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(tfSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnDichO, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(tfTu, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(tfDich, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(btnRepair, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(28, 28, 28)
                .addComponent(lMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 399, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(btnLoa, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnExitActionPerformed

    // nút thoát chương trình
    private void btnExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExitMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btnExitMouseClicked
    // nút xóa từ
    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        Word wordRemove = new Word();
        wordRemove = dictionaryLookupWord(tfTu.getText());
        dic.listWord.remove(wordRemove);
        try {
            writeAll(dic.listWord);
        } catch (IOException ex) {
            Logger.getLogger(ViewMain.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_btnDeleteActionPerformed
    // nút sửa từ
    private void btnRepairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRepairActionPerformed
        Word wordRepair = new Word();
         wordRepair = dictionaryLookupWord(tfSearch.getText());
         wordRepair.setWord_target(tfTu.getText());
       wordRepair.setWord_explain(tfDich.getText());
       for(Word word: dic.listWord){
           if(word.getWord_target().equals(tfSearch.getText())){
               int index = dic.listWord.indexOf(word);
               dic.listWord.set(index,wordRepair );    
               
       }
            
   }
       try {
            writeAll(dic.listWord);
        } catch (IOException ex) {
            Logger.getLogger(ViewMain.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_btnRepairActionPerformed
    
    // nut quay lai, reset data table
    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here
    DefaultTableModel  modelB = (DefaultTableModel) tbShow.getModel();
     modelB.setRowCount(0);
     
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBackMouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_btnBackMouseClicked

 // ghi 1 tu vao file 
     public static void write(ArrayList<Word> listWord ) throws FileNotFoundException, IOException {
//         Writer output;
//         output = new BufferedWriter(new FileWriter("dictionaries.txt",true));
         Writer output;
         output = new BufferedWriter(new OutputStreamWriter(
					new FileOutputStream("dictionaries.txt"), "UTF8"));
       output.append(System.getProperty( "line.separator" ));
         output.append(listWord.get(listWord.size() - 1).getWord_target() + "\t");
         output.append(listWord.get(listWord.size()-1).getWord_explain());
        
         output.close();
    }
     
     // ghi lai tat ca tu vao file 
     public  void writeAll( ArrayList<Word> listWord ) throws IOException{
         Writer output;
         output = new BufferedWriter(new OutputStreamWriter(
					new FileOutputStream("dictionaries.txt"), "UTF8"));
         int i = 0;
         for(Word word: dic.listWord){
             
            output.append(listWord.get(i).getWord_target() + "\t");
             output.append(listWord.get(i).getWord_explain());
             output.append(System.getProperty( "line.separator" ));
             i++;
             
         }
         output.close();
     }
  
       // Tim kiem tu
    public Word dictionaryLookupWord(String key){
       // Word wordSearch = new Word();
        for(Word word : dic.listWord){
            if(word.getWord_target().contains(key))
        return word;
    }
        return null;
    }
 

// nút thêm từ mới
    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        
        lMessage.setText("");
        if(!tfTu.getText().trim().equals("") || !tfDich.getText().trim().equals("")){
            Word wordAdd = new Word(tfTu.getText(), tfDich.getText());
            dic.listWord.add(wordAdd);
            try {
                writeAll(dic.listWord);
            } catch (IOException ex) {
                Logger.getLogger(ViewMain.class.getName()).log(Level.SEVERE, null, ex);
            }
     
        } else {
            lMessage.setText("Bạn chưa nhập đầy đủ dữ liệu!");
        }
           
    }//GEN-LAST:event_btnAddActionPerformed
 
  
    // nút tìm kiếm
    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
         DefaultTableModel  modelSearch = (DefaultTableModel) tbShow.getModel();
        ArrayList<Word> listSearch = new ArrayList<Word>();
        for(Word word : dic.listWord){
            if(word.getWord_target().contains(tfSearch.getText()))
            {
                listSearch.add(word);
            }
        }
        int i = 1;
         for (Word word : listSearch){
             //.setText(  word.getWord_target() + " " + word.getWord_explain());
             modelSearch.addRow(new Object[]{ word.getWord_target(), word.getWord_explain()});
             i += 1;
         }
        
        
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnSearchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSearchMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSearchMouseClicked

    private void tfSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfSearchActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_tfSearchActionPerformed

    private void tfDichActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfDichActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfDichActionPerformed

    private void jList2ValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_jList2ValueChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_jList2ValueChanged
    // nút phát âm
    private void btnLoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoaActionPerformed
        DefaultTableModel model = (DefaultTableModel) tbShow.getModel();
        Runnable task=()->{
           try {
               GoogleAPI.speakAPI("en", URLEncoder.encode(model.getValueAt(tbShow.getSelectedRow(), 0).toString(), "UTF-8"));
           } catch (UnsupportedEncodingException ex) {
               Logger.getLogger(ViewMain.class.getName()).log(Level.SEVERE, null, ex);
           }
       };
       Thread thread=new Thread(task);
       thread.start();
       
    }//GEN-LAST:event_btnLoaActionPerformed
// nút dịch online
    private void btnDichOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDichOActionPerformed
        String tuDich = "";
        try {
            tuDich = GoogleAPI.getAPI("en", "vi", tfSearch.getText());
        } catch (JSONException ex) {
            Logger.getLogger(ViewMain.class.getName()).log(Level.SEVERE, null, ex);
        }
       
         DefaultTableModel  modelOnline = (DefaultTableModel) tbShow.getModel();
         // hien ra hang trong table
         modelOnline.addRow(new Object[]{tfSearch.getText() , tuDich});
         Word wordAdd = new Word(tfSearch.getText(), tuDich);
         //  them tu do vao list
            dic.listWord.add(wordAdd);
            try {
                writeAll(dic.listWord);
            } catch (IOException ex) {
                Logger.getLogger(ViewMain.class.getName()).log(Level.SEVERE, null, ex);
            }
            
    }//GEN-LAST:event_btnDichOActionPerformed

    
       
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnAdd;
    public javax.swing.JButton btnBack;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnDichO;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnLoa;
    public javax.swing.JButton btnRepair;
    public javax.swing.JButton btnSearch;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lMessage;
    private javax.swing.JTable tbShow;
    private javax.swing.JTextField tfDich;
    private javax.swing.JTextField tfSearch;
    private javax.swing.JTextField tfTu;
    // End of variables declaration//GEN-END:variables

    private void main() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
