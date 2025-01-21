package com.patterns.designPattern.estructural.compositePattern;

import com.patterns.designPattern.estructural.compositePattern.composite.Folder;
import com.patterns.designPattern.estructural.compositePattern.leaf.File;

public class CompositeApplication {
   public static void main(String[]args) { // Criando arquivos
       File file1 = new File("documento.txt");
       File file2 = new File("foto.jpg");
       File file3 = new File("planilha.xlsx");

       // Criando pastas
       Folder folder1 = new Folder("Pasta Documentos");
       Folder folder2 = new Folder("Pasta Fotos");

       // Adicionando arquivos às pastas
       folder1.addComponent(file1);
       folder1.addComponent(file3);



       folder2.addComponent(file2);

       // Criando pasta principal
       Folder mainFolder = new Folder("Meu Computador");
       mainFolder.addComponent(folder1);
       mainFolder.addComponent(folder2);

       // Mostrando detalhes da estrutura
       mainFolder.showDetails();
   }
}
