class Result {
 /*
 * Complete the 'findMedian' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts INTEGER_ARRAY arr as parameter.
 */
 public static int findMedian(List<Integer> arr) {
 // Write your code here
 Collections.sort(arr);
 int half=arr.size()/2;
 return arr.get(half);
 }
}
