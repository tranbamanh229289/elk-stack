import { createSlice } from "@reduxjs/toolkit";

interface QueryState {
    listArticle: Article[];
}

interface Article {
    title: string;
    content: string;
    author: string;
}

const initialState: QueryState = {
    listArticle: [],
};

const queryReducer = createSlice({
    name: "query",
    initialState,
    reducers: {},
});

export default queryReducer.reducer;
