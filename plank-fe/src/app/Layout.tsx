import type { Metadata } from "next";

export const metadata: Metadata = {
    title: "Search engine",
    description: "Generated by create next app",
};

export default function LayoutApp({ children }: { children: React.ReactNode }) {
    return (
        <html lang="en">
            <body className="layout">{children}</body>
        </html>
    );
}
