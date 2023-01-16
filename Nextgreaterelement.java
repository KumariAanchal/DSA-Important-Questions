import java.util.*;
import java.lang.*;
public class Nextgreaterelement
{  
    public static void main(String args[])
    {
        int[]nums1={4,1,2};
        int[]nums2={1,3,4,2};
        int[]ans=nextGreaterElement(nums1,nums2);
        for(int i:ans){
            System.out.print(i+" ");
        }
            
        
    }
    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[]ans=new int[nums1.length];
        for(int i=0;i<nums1.length;i++){
            boolean flag=false;
            for(int j=0;j<nums2.length;j++){
                if(nums1[i]==nums2[j])flag=true;
                if(flag && nums1[i]<nums2[j]){
                    ans[i]=nums2[j];flag=false;break;
                }
            }
            if(flag)ans[i]=-1;
            
        }
        return ans;
    }
}

