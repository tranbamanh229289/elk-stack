import plugin from "tailwindcss/plugin";

const antd = {};

export default plugin(({ addUtilities }) => {
    addUtilities([antd]);
});
