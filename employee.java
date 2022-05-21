import java.util.*;  
class employee {
    int eNo;
    String eName;
    int eSalary;

    public void read(){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter ID : "); 
        eNo = Integer.parseInt(sc.nextLine());
        System.out.print("Enter Name : "); 
        eName = sc.nextLine();
        System.out.print("Enter monthly salary : "); 
        eSalary = Integer.parseInt(sc.nextLine());
    }

    public void display(){
        System.out.println("Match Found" );
        System.out.println("Name : "+ eName );
        System.out.println("Salary: "+ eSalary );
    }
    public static void main(String []args){
         
        int i,f=0;
        int No;
        System.out.print("Enter No : "); 
        Scanner sc1 = new Scanner(System.in);
        int n = sc1.nextInt();
        employee emp[] = new employee[n];
        for(i=0;i<n;i++){
            emp[i] = new employee();
            emp[i].read();
        }
        System.out.println("Search"); 
      
            Scanner sc= new Scanner(System.in);
            System.out.print("Enter ID : "); 
            No = Integer.parseInt(sc.nextLine());
            for(i=0;i<n;i++){
                if(emp[i].eNo == No){
                    emp[i].display();
                     f=1;
                }
            }
          if(f==0)
           System.out.println("Employee not found");
        }

    }
 