package coplit.dataStructure;

import java.util.ArrayList;
import java.util.Stack;

public class Stack_03_BrowserPrevNext {
    public ArrayList<Stack> browserStack(String[] actions, String start){
        Stack<String> prevStack = new Stack<>();
        Stack<String> nextStack = new Stack<>();
        Stack<String> current = new Stack<>();
        ArrayList<Stack> result = new ArrayList<>();

        //start가 주어졌을 때
        current.add(start);

        //뒤로가기
        for(int i = 0; i < actions.length; i++){
            //-1을 누르거나 prevStack이 비어있을때
            if(actions[i].equals("-1") && !prevStack.empty()){
                //prevPage 마지막 값 가져오고 지우기
                String prevePage = prevStack.pop();
                //nextPage에 원래 페이지 가져오고 지우기
                nextStack.push(current.pop());
                //현재 페이지에 prev값 넣기
                current.push(prevePage);
            }

            //앞으로가기
            else if(actions[i].equals("1") && !nextStack.empty()){
                //nextPage에 마지막 값 가져오고 지우기
                String nextPage = nextStack.pop();
                //prevPage에 원래 페이지 넣고 지우기
                prevStack.push(current.pop());
                //현재 페이지에 next값 넣기
                current.push(nextPage);
            }

            //뒤로가기, 앞으로가기 비활성화일 경우 stack에 push 안함
            else if(actions[i].equals("1") || actions[i].equals("-1")){
            }
            else{
                //prev에 원래 페이지 넣고 지우기
                prevStack.push(current.pop());
                //현재 페이지에 값 넣기
                current.push(actions[i]);
                //다음 페이지 비우기
                nextStack.clear();
            }
        }
        //방문했던 페이지들이 담긴 stack 반환(첫번째, 두번째, 세번째)
        result.add(prevStack);
        result.add(current);
        result.add(nextStack);

        return result;
    }
}
