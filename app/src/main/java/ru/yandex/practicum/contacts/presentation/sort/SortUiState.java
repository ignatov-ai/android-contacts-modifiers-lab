package ru.yandex.practicum.contacts.presentation.sort;

// класс UiState должен иметь package-private доступ
public class SortUiState {

    // сделайте поля isApplyEnable и newSelectedSortType приватными
    private boolean isApplyEnable = false;
    private String newSelectedSortType = null;

    // реализуйте get и set методы для обоих полей
    public boolean getIsApplyEnable() {
        return isApplyEnable;
    }

    public void setNewSelectedSortType(String newSelectedSortType){
        this.newSelectedSortType = newSelectedSortType;
    }


}
