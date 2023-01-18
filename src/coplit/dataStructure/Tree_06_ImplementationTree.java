package coplit.dataStructure;

import java.util.ArrayList;

public class Tree_06_ImplementationTree {
    private String value;
    private ArrayList<Solution> children;

    public Solution() {
        this.value = null;
        this.children = null;
    }
    public Solution(String data) {
        this.value = data;
        this.children = null;
    }

    public void setValue(String data) {
        this.value = data;
    }

    public String getValue() {
    }
    public void addChildNode(Solution node) {
        if(children == null) children = new ArrayList<>();
        children.add(node);
    }
    public void removeChildNode(Solution node) {
        String data = node.getValue();

        if(children != null) {
            for(int i = 0; i < children.size(); i++) {
                if(children.get(i).getValue().equals(data)) {
                    children.remove(i);
                    return;
                }
                if(children.get(i).children != null) children.get(i).removeChildNode(node);
            }
        }
    }

    public ArrayList<Solution> getChildrenNode() {
        return children;
    }

    public boolean contains(String data) {
        if(value.equals(data)) return true;

        boolean check;

        if(children != null) {
            for(int i = 0; i < children.size(); i++) {
                check = children.get(i).contains(data, false);
                if(check) return true;
            }
        }
        return false;
    }

    public boolean contains(String data, boolean check) {
        if(value.equals(data)) return true;

        if(children != null) {
            for(int i = 0; i < children.size(); i++) {
                check = children.get(i).contains(data, check);
            }
        }
        return check;
    }
}
