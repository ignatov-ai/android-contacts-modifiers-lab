package ru.yandex.practicum.contacts.presentation.sort;

// класс UiState должен иметь package-private доступ
public class SortUiState {

    private boolean isApplyEnable = false;
    private String newSelectedSortType = null;

    public boolean getApplyEnable() {
        return isApplyEnable;
    }

    public void setApplyEnable(final boolean ApplyEnable){
        isApplyEnable = ApplyEnable;
    }

    public void setNewSelectedSortType(final String newSelectedSortType){
        this.newSelectedSortType = newSelectedSortType;
    }


}
