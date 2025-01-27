class Solution {
    public boolean validMountainArray(int[] arr) {
        int n = arr.length-1;
    if(arr.length<3){
        return false;
    }
    int index=0;
    //find increasing part of the array
    while(index < n){
        if(arr[index]<arr[index+1]){
            index++;
        }else{
            break;
        }
    }
    if(index==n || arr[0]>arr[1]){
        return false;
    }
//decrease order
while(index<n){
    if(arr[index]>arr[index+1]){
        index++;
    }else{
        return false;
    }
} if(index==n){
    return true;
}
return false;
    }
}











//         int index =0;
//         int n = arr.length;
//         //find a increase seq(find the peek)
//         while(index<n-1){
//             if(arr[index]<arr[index+1]){
//                 index++;
//             }else{
//                 break; 
//             }
//         }
//         if(index==0 || index==n-1){
//             return false;
//         }
//         //find a decreasing seq(find the end of the array)
//             while(index<n-1){
//                 if(arr[index]>arr[index+1]){
//                   index++;
//                 }else{
//                     break;
//                 }
//         }
//         if(index==n-1){
//             return true;
//         }
//         return false;
//     }
// }