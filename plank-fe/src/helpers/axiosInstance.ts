import axios, { AxiosError, AxiosInstance } from "axios";

export const axiosInstance: AxiosInstance = axios.create({
    timeout: 10000,
    headers: {},
});

axiosInstance.interceptors.request.use(
    (config) => {
        return config;
    },
    (err) => {
        Promise.reject(err);
    }
);

axiosInstance.interceptors.response.use(
    (response) => {
        const data = response.data.data;
        response.data = data;
        return Promise.resolve(response);
    },
    (err: AxiosError) => {
        return Promise.reject(err);
    }
);
