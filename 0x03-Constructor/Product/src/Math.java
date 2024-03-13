public class Math {
    int val;
    Math add(Math obj2){
        Math obj = new Math();
        obj.val = this.val + obj2.val;
        return (obj);
    }
}
