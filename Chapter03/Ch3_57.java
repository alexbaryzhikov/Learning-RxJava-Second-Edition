import io.reactivex.rxjava3.core.Observable;
public class Ch3_57 {
    public static void main(String[] args) {
        Observable.just("One", "Two", "Three")
                .doOnEach(s -> System.out.println("doOnEach: " + s))
                .subscribe(i -> System.out.println("Received: " + i));
    }
}