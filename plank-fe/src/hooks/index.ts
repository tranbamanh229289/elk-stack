import { configureStore } from "@reduxjs/toolkit";
import querySlice from "./query/querySlice";

export const store = configureStore({
    reducer: {
        queries: querySlice,
    },
});
