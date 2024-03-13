public class Math {
    int val;
    Math add(Math obj2){
        Math obj = new Math();
        obj.val = this.val + obj2.val;
        return (obj);
    }
    boolean isEqual(Math obg2){
        if (this.val == obg2.val)
            return true;
        else
            return false;
    }
}
