class Solution:
    def findMin(self, arr: List[int]) -> int:
        low , high = 0,len(arr)-1 
        minimum =  sys.maxsize
        while(low <= high):
            mid = ( low + high)//2 
 
            if(arr[low] <= arr[mid]):
                if(arr[low] < minimum):
                    minimum = arr[low]
                low = mid + 1
            else:
                if(arr[mid] < minimum):
                    minimum = arr[mid]
                high = mid - 1
 
        return minimum
            