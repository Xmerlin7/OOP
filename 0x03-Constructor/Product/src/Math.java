public class Math {
    int val;
    static int add(Math obj1, Math obj2){
        Math obj = new Math();
        obj.val = obj1.val + obj2.val;
        return (obj).val;
    }
}
