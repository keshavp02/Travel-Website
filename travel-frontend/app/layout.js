import Home from "@/components/Search";

export const metadata = {
  title: 'Next.js',
  description: 'Generated by Next.js',
}


export default function RootLayout({ children }) {
 return (
    <html lang="en">
      <body>
      <Home></Home>
      {children}</body>
    </html>
  )
}
