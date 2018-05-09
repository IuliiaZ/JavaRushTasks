package com.javarush.task.task36.task3608.model;

import com.javarush.task.task36.task3608.bean.User;

public class FakeModel implements Model {
    private ModelData modelData = new ModelData();;
    @Override
    public ModelData getModelData() {
        return modelData;
    }

    @Override
    public void loadUsers() {
        modelData.getUsers().add(new User("A", 100, 1));
        modelData.getUsers().add(new User("B", 200, 2));
        modelData.getUsers().add(new User("C", 300, 3));
        modelData.getUsers().add(new User("D", 400, 4));
        modelData.getUsers().add(new User("F", 500, 5));
    }

    @Override
    public void loadDeletedUsers() {
        throw new UnsupportedOperationException();
    }

    @Override
    public void loadUserById(long userId) {
        throw new UnsupportedOperationException();
    }
}
