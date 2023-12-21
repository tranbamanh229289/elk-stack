import LayoutApp from "@/app/Layout";
import "../styles/index.scss";

function App({ children }: any) {
    return (
        <>
            <LayoutApp>{children}</LayoutApp>
        </>
    );
}

export default App;
