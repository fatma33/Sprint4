
import java.io.File;
import java.io.IOException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class StoreOwner {
    
   
   
    
    File file1 = new File("Aproducts.txt");
    File file5 = new File("SoldProducts.txt");
    ListingView listview=new ListingView();
 
    BuyingViewer storeview=new BuyingViewer(); 
    DatabaseConfirmation databaseconfirm=new DatabaseConfirmation();
    DatabaseWriter databasewrite=new DatabaseWriter();
   
    

    public StoreOwner() {
    }
    
    
     public void BuyAsAStoreOwner() throws IOException {
        
      listview.listviewProductDetails(file1);
     
    String TargetProduct=storeview.ChooseProduct();
storeview.CheckingProduct();
   
        String array1[] = {TargetProduct};
        boolean check=databaseconfirm.Read(file1, array1, 1);
      

        if (check == true) {
            String arrayInfo[]=storeview.EnterInfo();
            String array[]= {TargetProduct,arrayInfo[2] ,arrayInfo[1]};
            databasewrite.Write_to_file(file5, array);
            storeview.ConfirmBuying();
           
            
            
        } else {
            storeview.ProductNotExists();
            
        }
    
    
    
     }}
          