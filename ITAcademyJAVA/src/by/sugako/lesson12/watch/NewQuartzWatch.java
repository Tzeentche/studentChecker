package by.sugako.lesson12.watch;

public class NewQuartzWatch extends QuartzWatch {

    private Showable showable;

    public NewQuartzWatch(Showable showable) {
        this.showable = showable;
    }

    @Override
    public void showTime() {
        showable.showTime();
    }
}
