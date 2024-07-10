package org.urr.screenner_bot.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import java.io.Serializable;
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Post implements Serializable {
    private int requestVersion;
    private String merchant;
    private int offset;

    private boolean isMultiCategorySearch;
    private boolean searchByOriginalQuery;
    private char[] selectedSuggestParams;

    private char[] expandedFiltersIds;

    private int sorting;

    private String ageMore18;

    private boolean showNotAvailable;
    private char selectedFilters;

    private String searchText;

    private String auth;
}
