public class Switch_Case {
    public static void main(String[] args) {
//         int choice =49;
//         switch (choice){
//            case 1:
//            System.out.println("goa is on");
//            break;
//            case 2:
//            System.out.println("pondicherry is on ");
//            break;
//            case 3:
//             System.out.println("kerala is on");
//             break;
//             default:
//                 System.out.println("no match found");


//         }
//     }
// }

        String name ="rishi";
        int len=5;
        int pos;
        for(pos = 0; pos<len; pos++){
            System.out.println(pos);
            char ch = name.charAt(pos);
        if(ch == 'a' || ch =='e' || ch == 'i' || ch == 'o'|| ch == 'u'){
            System.out.println("hi vowel:\t "+ch);
        }
        else 
        {
            System.out.println("hi consonant:\t "+ch);
        }
    }
}            
        }