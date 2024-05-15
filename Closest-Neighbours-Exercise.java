class ClosestNeighbours {
    public static void main(String[] args) {
        int[] myArray = {0, 5, 1209, 6, 2, 111, 112, 33};
        
        int[] result = new int; // Array to store the closest neighbors
        
        for (int i = 0; i < myArray.length - 1; i++) { // Loop through array until second last element
            int difference = Math.abs(myArray[i] - myArray[i + 1]);
            if (difference < minDifference) { // If current difference is smaller than previous minimum
                minDifference = difference;
                result[0] = myArray[i]; // Update result array with closest neighbors
                result[1] = myArray[i + 1];
            }
        }
        
        System.out.println("Closest Neighbors: " + result[0] + result[1] + " with difference " + minDifference);
    }


