class Solution {
    public int[] searchRange(int[] nums, int target) {
        int left=first(nums,nums.length,target);
        int right=last(nums,nums.length,target);
        return new int[]{left,right};
    }
static int first(int arr[] , int n , int x){
int start = 0;
int end = n -1;
int res = -1;
while(start <= end){
int mid = start + end - start / 2;
if(x == arr[mid]){
res = mid;
end = mid - 1;
}
else if(x < arr[mid])
end = mid - 1;
else
start = mid + 1;
}
return res;
}
static int last(int arr[] , int n , int x){
int start = 0;
int end = n -1;
int res = -1;
while(start <= end){
int mid = start + end - start / 2;
if(x == arr[mid]){
res = mid;
start = mid + 1;
}
else if(x < arr[mid])
end = mid -1;
else
start = mid + 1;
}
return res;
}}
    