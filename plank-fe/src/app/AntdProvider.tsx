import { ConfigProvider } from "antd";

export const AntdProvider = ({ children }: any) => {
    return <ConfigProvider>{children}</ConfigProvider>;
};
