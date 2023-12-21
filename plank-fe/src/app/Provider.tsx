import { store } from "@/hooks";
import { Provider } from "react-redux";
import { SWRConfig } from "swr";
import { AntdProvider } from "./AntdProvider";

const AppProvider = ({ children }: any) => {
    return (
        <>
            <Provider store={store}>
                <SWRConfig>
                    <AntdProvider>{children}</AntdProvider>
                </SWRConfig>
            </Provider>
        </>
    );
};

export default AppProvider;
