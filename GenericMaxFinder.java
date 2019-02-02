public class GenericMaxFinder implements FindMaxInterface{
    
    public GenericMethods(){} //empty constructor
    
    public <AnyType extends Comparable<AnyType>> AnyType findMax(AnyType[] arr){ //finds Max of any array
        for(int i=1; i<arr.length; i++){
            if(((arr[i-1]).compareTo(arr[i]))>0){
                AnyType temp = arr[i-1];
                arr[i-1] = arr[i];
                arr[i] = temp;
            }
        }
        return arr[(arr.length)-1];
    }
}
