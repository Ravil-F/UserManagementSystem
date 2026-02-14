package app.model;

import app.entities.User;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Model {
    private static Model instance;
    private List<User> model;

    private Model(){
        model = new ArrayList<>();
    }

    public static Model getInstance(){
        if(instance == null)
            instance = new Model();
        return instance;
    }

    public void add(User user){
        model.add(user);
    }

    public List<String> listName(){
        return model.stream()
                .map(User::getName)
                .collect(Collectors.toList());
    }

    public List<String> listLastName(){
        return model.stream()
                .map(User::getLastName)
                .collect(Collectors.toList());
    }

    public List<String> listGender(){
        return model.stream()
                .map(User::getGender)
                .collect(Collectors.toList());
    }

    public List<Integer> listAge(){
        return model.stream()
                .map(User::getAge)
                .collect(Collectors.toList());
    }

    public List<String> listEmail(){
        return model.stream()
                .map(User::getEmail)
                .collect(Collectors.toList());
    }

    public void del(String name){
        boolean flag = true;
        for(int i = 0; i < model.size() && flag; i++){
            if(model.get(i).getName().equals(name)) {
                model.remove(i);
                flag = false;
            }
        }
    }

    public List<User> getAllUsers(){
        return new ArrayList<>(model);
    }

}
