package scha.efer.honey.tab;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

public class HoneyTemplate {

    @Getter private final List<String> left;
    @Getter private final List<String> middle;
    @Getter private final List<String> right;
    @Getter private final List<String> farRight;

    public HoneyTemplate() {
        left = new ArrayList<>();
        middle = new ArrayList<>();
        right = new ArrayList<>();
        farRight = new ArrayList<>();
    }

    /*
        Will only display on 1.8 clients
     */
    public HoneyTemplate farRight(String string) {
        return farRight(farRight.size(), string);
    }

    public HoneyTemplate farRight(int index, String string) {
        if (index > farRight.size()) {
            for (int i = farRight.size(); i < index; i++) {
                farRight.add("");
            }
        }
        farRight.add(index, string);
        return this;
    }

    public HoneyTemplate left(String string) {
        return left(left.size(), string);
    }

    public HoneyTemplate middle(String string) {
        return middle(middle.size(), string);
    }

    public HoneyTemplate right(String string) {
        return right(right.size(), string);
    }

    public HoneyTemplate left(int index, String string) {
        if (index > left.size()) {
            for (int i = left.size(); i < index; i++) {
                left.add("");
            }
        }
        left.add(index, string);
        return this;
    }

    public HoneyTemplate middle(int index, String string) {
        if (index > middle.size()) {
            for (int i = middle.size(); i < index; i++) {
                middle.add("");
            }
        }
        middle.add(index, string);
        return this;
    }

    public HoneyTemplate right(int index, String string) {
        if (index > right.size()) {
            for (int i = right.size(); i < index; i++) {
                right.add("");
            }
        }
        right.add(index, string);
        return this;
    }

}
