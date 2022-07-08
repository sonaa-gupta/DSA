class Solution {
    public int maxArea(int[] arr) {
        int max_water=0,curr_water=0;
int l=0,r=arr.length-1;

while(l<=r)
{
   int hl=arr[l];
    int hr=arr[r];
    curr_water=Math.min(hl,hr)*(r-l);
    max_water=Math.max(max_water,curr_water);
    if(hl<=hr) l++;
    if(hr<=hl) r--;

}
return max_water;
    }
}