int pivotIndex(int* nums, int numsSize) {
    int l=0;
    int f=0;
    for(int i=0;i<numsSize;i++){
        int r=0;
        for(int j=i+1;j<numsSize;j++){
            r+=nums[j];
        }
        if(l==r){
        return i;
        }
        else
        l+=nums[i];
    }
    return -1;
}